import com.yok.parser.YokBaseListener;
import org.antlr.v4.runtime.tree.ErrorNode;

public
class CustomYokListener extends YokBaseListener
{
	@Override
	public void visitErrorNode(ErrorNode node)
	{
		node.getSymbol().getText();
	}
}
