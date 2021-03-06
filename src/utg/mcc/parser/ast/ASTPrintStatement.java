package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;

public class ASTPrintStatement extends ASTStatement {

  public final ASTExpressionStatement expression;

  public ASTPrintStatement(ASTExpressionStatement expression) {
    super();
    this.expression = expression;
  }

  @Override
  public String toString() {
    return ""
        + (new ASTIdentityTransformation()).visitPrintStatement(this,
            "");
  }

  @Override
  public Object accept(ASTVisitor visitor, Object o) {
    return visitor.visitPrintStatement(this, o);
  }
}
