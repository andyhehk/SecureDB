package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.parse.ParseNode;

/**
 * Created by andy on 10/6/15.
 */
public abstract class SchemeDecorator extends AbstractRewriter {

  protected AbstractRewriter rewriter;

  public SchemeDecorator(DBMeta dbMeta, AbstractRewriter rewriter) {
    super(dbMeta);
    this.rewriter = rewriter;
  }


}
