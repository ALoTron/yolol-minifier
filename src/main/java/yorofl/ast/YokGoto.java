package yorofl.ast;

import java.util.Objects;

public
class YokGoto implements YokStatement
{
	YokExpression value;

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
