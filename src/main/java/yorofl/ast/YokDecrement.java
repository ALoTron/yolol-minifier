package yorofl.ast;

import java.util.Objects;

public
class YokDecrement implements YokValue
{
	private YokVar  var;
	private boolean isPostDecrement;

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
	boolean isPostDecrement()
	{
		return isPostDecrement;
	}

	public
	void setPostDecrement(boolean postDecrement)
	{
		isPostDecrement = postDecrement;
	}
}
