package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;

public class ASTExpressionStatement extends ASTStatement {

	public final ASTVariable variable;

	public final ASTExpression expression;
	public final ASTExpressionStatement expressionS;
	public boolean flag = false;

	public ASTExpressionStatement(ASTVariable variable, ASTExpressionStatement expression) {
		super();
		this.variable = variable;
		this.expressionS = expression;
		this.expression = null;
	}

	public ASTExpressionStatement(ASTExpression expression) {
		super();
		this.variable = null;
		this.expressionS = null;
		this.expression = expression;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "" + (new ASTIdentityTransformation()).visitExpressionStatement(this, "");
	}

	@Override
	public Object accept(ASTVisitor visitor, Object o) {
		return visitor.visitExpressionStatement(this, o);
	}
}
