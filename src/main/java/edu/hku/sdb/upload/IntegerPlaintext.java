package edu.hku.sdb.upload;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.crypto.Crypto;

import java.math.BigInteger;

/**
 * Created by Eric Haibin Lin on 14/2/15.
 * An integer plaintext returns itself if it is not sensitive, returns encrypted value with supplied columnKey if so.
 */
public class IntegerPlaintext extends AbstractPlaintext {

  //TODO should use ENC TYPE to determine whether to encrypt the value by Paillier / SIES or secret sharing
  private boolean isSensitive;
  private BigInteger n;
  private BigInteger g;
  private BigInteger p;
  private BigInteger q;
  private BigInteger totient;
  private BigInteger rowId;
  private ColumnKey columnKey;

  public BigInteger getTotient() {
    return totient;
  }

  public void setTotient(BigInteger totient) {
    this.totient = totient;
  }

  public ColumnKey getColumnKey() {
    return columnKey;
  }

  public void setColumnKey(ColumnKey columnKey) {
    this.columnKey = columnKey;
  }

  public BigInteger getRowId() {
    return rowId;
  }

  public void setRowId(BigInteger rowId) {
    this.rowId = rowId;
  }

  public BigInteger getG() {
    return g;
  }

  public void setG(BigInteger g) {
    this.g = g;
  }

  public BigInteger getP() {
    return p;
  }

  public void setP(BigInteger p) {
    this.p = p;
  }

  public BigInteger getQ() {
    return q;
  }

  public void setQ(BigInteger q) {
    this.q = q;
  }

  public boolean isSensitive() {
    return isSensitive;
  }

  public void setSensitive(boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public BigInteger getN() {
    return n;
  }

  public void setN(BigInteger n) {
    this.n = n;
  }

  @Override
  public String toString(){
    if (!isSensitive){
      return plainText;
    }
    BigInteger itemKey = Crypto.generateItemKeyOp2(columnKey.getM(), columnKey.getX(), rowId, g, n, totient, p, q);
    BigInteger encryptedValue = Crypto.encrypt(new BigInteger(plainText), itemKey, n);

    return Crypto.getSecureString(encryptedValue);
  }
}
