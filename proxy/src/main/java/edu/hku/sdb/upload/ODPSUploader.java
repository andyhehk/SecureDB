package edu.hku.sdb.upload;

import com.aliyun.odps.Column;
import com.aliyun.odps.Odps;
import com.aliyun.odps.PartitionSpec;
import com.aliyun.odps.TableSchema;
import com.aliyun.odps.account.Account;
import com.aliyun.odps.account.AliyunAccount;
import com.aliyun.odps.data.Record;
import com.aliyun.odps.data.RecordWriter;
import com.aliyun.odps.tunnel.TableTunnel;
import com.aliyun.odps.tunnel.TableTunnel.UploadSession;
import com.aliyun.odps.tunnel.TunnelException;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.conf.ODPSServerConf;
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.utility.ParserConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * Created by andy on 10/7/15.
 */
public class ODPSUploader extends Uploader {

  private static final Logger LOG = LoggerFactory.getLogger(ODPSUploader.class);

  private String accessId;
  private String accessKey;
  private String tunnelUrl;
  private String odpsUrl;
  private String project;
  private String partition;


  public ODPSUploader(MetaStore metaStore, String tblName, ServerConf serverConf) {
    super(metaStore, tblName, serverConf);

    ODPSServerConf odpsServerConf = (ODPSServerConf) serverConf;

    accessId = odpsServerConf.getAccessID();
    accessKey = odpsServerConf.getAccessKey();
    odpsUrl = odpsServerConf.getOdpsURL();
    project = odpsServerConf.getProject();
    tunnelUrl = odpsServerConf.getTunnelURL();
  }

  @Override
  public void upload() {
    Account account = new AliyunAccount(accessId, accessKey);
    Odps odps = new Odps(account);
    odps.setEndpoint(odpsUrl);
    odps.setDefaultProject(project);
    try {
      TableTunnel tunnel = new TableTunnel(odps);
      tunnel.setEndpoint(tunnelUrl);
      PartitionSpec partitionSpec;
      UploadSession uploadSession;

      if(partition == null) {
        uploadSession = tunnel.createUploadSession(project, tblName);
      }
      else {
        partitionSpec = new PartitionSpec(partition);
        uploadSession = tunnel.createUploadSession(project,
                tblName, partitionSpec);
      }

      System.out.println("Session Status is : "
              + uploadSession.getStatus().toString());

      TableSchema schema = uploadSession.getSchema();
      RecordWriter recordWriter = uploadSession.openRecordWriter(0);
      UploadHandler uploadHandler = new UploadHandler(metaStore, tblName,
              serverConf);


      BufferedReader bufferedReader = new BufferedReader(new FileReader
              (sourceFilePath), 32768);
      String line;
      int numCol = schema.getColumns().size();
      Record record = uploadSession.newRecord();
      //Read and process plaintext line by line
      while ((line = bufferedReader.readLine()) != null) {
        String newLine = uploadHandler.processLine(line);
        String[] columns = newLine.split(ParserConstant.DEFAULT_FIELD_DELIMETER);

        for (int i = 0; i < numCol; i++) {
          Column column = schema.getColumn(i);
          switch (column.getType()) {
            case BIGINT:
              record.setBigint(i, Long.valueOf(columns[i]));
              break;
            case BOOLEAN:
              record.setBoolean(i, Boolean.valueOf(columns[i]));
              break;
            case DATETIME:
              record.setDatetime(i, new Date(columns[i]));
              break;
            case DOUBLE:
              record.setDouble(i, Double.valueOf(columns[i]));
              break;
            case STRING:
              record.setString(i, columns[i]);
              break;
            default:
              throw new RuntimeException("Unknown column type: "
                      + column.getType());
          }
        }
        recordWriter.write(record);
      }

      //close resources
      bufferedReader.close();
      recordWriter.close();

      uploadSession.commit(new Long[]{0L});
      LOG.info("upload success!");
    } catch (TunnelException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


  @Override
  public String getServerFilePath() {
    return null;
  }

}
