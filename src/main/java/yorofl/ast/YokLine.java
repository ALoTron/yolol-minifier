package yorofl.ast;

import java.util.Objects;

public
class YokLine
{
	private YokMultipleStatements multipleStatements;

	public
	YokMultipleStatements getMultipleStatements()
	{
		return multipleStatements;
	}

	public
	void setMultipleStatements(YokMultipleStatements multipleStatements)
	{
		this.multipleStatements = Objects.requireNonNull(multipleStatements);
	}
}
