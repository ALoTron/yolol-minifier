package yorofl.ast;

import java.util.Objects;

public
class YokIfStatement implements YokStatement
{
	private YokExpression         condition;
	private YokMultipleStatements ifTrue;
	private YokMultipleStatements ifFalse;

	public
	YokExpression getCondition()
	{
		return condition;
	}

	public
	void setCondition(YokExpression condition)
	{
		this.condition = Objects.requireNonNull(condition);
	}

	public
	YokMultipleStatements getIfTrue()
	{
		return ifTrue;
	}

	public
	void setIfTrue(YokMultipleStatements ifTrue)
	{
		this.ifTrue = Objects.requireNonNull(ifTrue);
	}

	public
	YokMultipleStatements getIfFalse()
	{
		return ifFalse;
	}

	public
	void setIfFalse(YokMultipleStatements ifFalse)
	{
		this.ifFalse = Objects.requireNonNull(ifFalse);
	}
}
