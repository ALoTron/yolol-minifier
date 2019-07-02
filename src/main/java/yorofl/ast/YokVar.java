package yorofl.ast;

import java.util.Objects;

public
class YokVar implements YokValue
{
	private String  name;
	private int     intContent;
	private String  stringContent;
	private boolean isInt;

	public
	String getName()
	{
		return name;
	}

	public
	void setName(String name)
	{
		this.name = Objects.requireNonNull(name);
	}

	public
	String getAsString()
	{
		return stringContent;
	}

	public
	int getAsInt()
	{
		return intContent;
	}

	public
	void setContent(String content)
	{
		this.stringContent = Objects.requireNonNull(content);
		this.intContent    = Integer.parseInt(Objects.requireNonNull(content));
	}

	public
	void setContent(int content)
	{
		this.stringContent = String.valueOf(content);
		this.intContent    = content;
	}

	public
	void setIsInt(boolean isInt)
	{
		this.isInt = isInt;
	}

	public
	boolean isInteger()
	{
		return isInt;
	}

	public
	boolean isExternalVar()
	{
		return name.startsWith(":");
	}
}
