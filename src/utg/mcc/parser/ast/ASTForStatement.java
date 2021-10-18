package utg.mcc.parser.ast;

import utg.mcc.parser.util.ASTIdentityTransformation;

public class ASTForStatement extends ASTStatement {

	public final ASTExpressionStatement initialization, update;
	public final ASTExpression expression;
	public final ASTNode statement;

	public ASTForStatement(ASTExpressionStatement initialization, ASTExpression expression, ASTExpressionStatement update,
			ASTNode statement) {
		super();
		this.initialization = initialization;
		this.expression = expression;
		this.update = update;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "" + (new ASTIdentityTransformation()).visitForStatement(this, "");
	}

	@Override
	public Object accept(ASTVisitor visitor, Object o) {
		return visitor.visitForStatement(this, o);
	}
}
