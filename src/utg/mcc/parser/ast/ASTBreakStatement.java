package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;
import utg.mcc.semantic.environment.FunEntry;

public class ASTBreakStatement extends ASTStatement {

  public FunEntry entry;

  public ASTBreakStatement() {
    super();
  }

  @Override
  public String toString() {
    return ""
        + (new ASTIdentityTransformation()).visitBreakStatement(this,
            "");
  }

  @Override
  public Object accept(ASTVisitor visitor, Object o) {
    return visitor.visitBreakStatement(this, o);
  }
}
