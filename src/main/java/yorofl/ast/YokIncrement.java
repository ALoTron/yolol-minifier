package yorofl.ast;

import java.util.Objects;

public
class YokIncrement implements YokValue
{
	private YokVar  var;
	private boolean isPostIncrement;

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
	boolean isPostIncrement()
	{
		return isPostIncrement;
	}

	public
	void setPostIncrement(boolean postIncrement)
	{
		isPostIncrement = postIncrement;
	}
}



