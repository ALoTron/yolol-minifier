package yorofl.ast;

import java.util.ArrayList;
import java.util.List;

public
class YokPrefixoperation implements YokMathexpression
{
	private YokMathexpression a;
	private PrefixOperator    op;

	public
	List<YokMathexpression> getArguments()
	{
		List<YokMathexpression> output = new ArrayList<>();
		output.add(a);

		return output;
	}

	public
	PrefixOperator getOperator()
	{
		return op;
	}
}