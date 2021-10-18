package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;
import utg.mcc.semantic.environment.FunEntry;

public class ASTContinueStatement extends ASTStatement {

  public FunEntry entry;

  public ASTContinueStatement() {
    super();
  }

  @Override
  public String toString() {
    return ""
        + (new ASTIdentityTransformation()).visitContinueStatement(this,
            "");
  }

  @Override
  public Object accept(ASTVisitor visitor, Object o) {
    return visitor.visitContinueStatement(this, o);
  }
}
