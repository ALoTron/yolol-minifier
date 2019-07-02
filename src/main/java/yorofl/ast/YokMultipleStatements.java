package yorofl.ast;

import java.util.List;
import java.util.Objects;

public
class YokMultipleStatements
{
	private List<YokStatement> statements;

	public
	List<YokStatement> getStatements()
	{
		return statements;
	}

	public
	void setStatements(List<YokStatement> statements)
	{
		this.statements = Objects.requireNonNull(statements);
	}
}
