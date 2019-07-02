package yorofl.ast;

import java.util.List;

public
interface YokMathexpression extends YokExpression
{
	List getArguments();

	Operator getOperator();


}
