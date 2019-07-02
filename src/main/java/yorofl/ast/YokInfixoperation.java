package yorofl.ast;

import java.util.ArrayList;
import java.util.List;

public
class YokInfixoperation implements YokMathexpression
{
	private YokMathexpression a;
	private YokMathexpression b;
	private InfixOperator     op;

	public
	List<YokMathexpression> getArguments()
	{
		List<YokMathexpression> output = new ArrayList<>();
		output.add(a);
		output.add(b);

		return output;
	}

	public
	InfixOperator getOperator()
	{
		return op;
	}
}
