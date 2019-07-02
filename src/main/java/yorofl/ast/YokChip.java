package yorofl.ast;

import java.util.List;
import java.util.Objects;

public
class YokChip
{
	private List<YokLine> lines;

	public
	List<YokLine> getLines()
	{
		return lines;
	}

	public
	void setLines(List<YokLine> lines)
	{
		this.lines = Objects.requireNonNull(lines);
	}
}
