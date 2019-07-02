package yorofl.ast;

import java.util.Objects;

public
class YokString implements YokPrimitive
{
	private String string;

	public
	String getString()
	{
		return string;
	}

	public
	void setString(String string)
	{
		this.string = Objects.requireNonNull(string);
	}
}