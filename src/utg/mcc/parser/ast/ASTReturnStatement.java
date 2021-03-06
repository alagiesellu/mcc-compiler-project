package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;
import utg.mcc.semantic.environment.FunEntry;

public class ASTReturnStatement extends ASTStatement {

  public final ASTExpressionStatement expression;

  public FunEntry entry;

  public ASTReturnStatement(ASTExpressionStatement op) {
    super();
    this.expression = op;
  }

  @Override
  public String toString() {
    return ""
        + (new ASTIdentityTransformation()).visitReturnStatement(this,
            "");
  }

  @Override
  public Object accept(ASTVisitor visitor, Object o) {
    return visitor.visitReturnStatement(this, o);
  }
}
