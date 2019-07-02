package yorofl.ast;

import java.util.ArrayList;
import java.util.List;

public
class YokPrimaryoperation implements YokMathexpression
{
	private YokValue value;

	public
	List<YokValue> getArguments()
	{
		List<YokValue> output = new ArrayList<>();
		output.add(value);

		return output;
	}

	public
	Operator getOperator()
	{
		return null;
	}
}
