package yorofl.ast;

import java.util.Objects;

public
class YokVarassignment implements YokStatement
{
	private YokVar         var;
	private AssignOperator op;
	private YokExpression  value;

	public
	YokVar getVar()
	{
		return var;
	}

	public
	void setVar(YokVar var)
	{
		this.var = Objects.requireNonNull(var);
	}

	public
	AssignOperator getOp()
	{
		return op;
	}

	public
	void setOp(AssignOperator op)
	{
		this.op = Objects.requireNonNull(op);
	}

	public
	YokExpression getValue()
	{
		return value;
	}

	public
	void setValue(YokExpression value)
	{
		this.value = Objects.requireNonNull(value);
	}
}
