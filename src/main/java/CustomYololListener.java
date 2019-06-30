import com.yolol.parser.YololBaseListener;
import com.yolol.parser.YololParser;
import com.yolol.parser.YololParser.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class CustomYololListener extends YololBaseListener {

    // maps original variable name to minified variable name
    private Map<String, String> varMap = new HashMap<>();

    private StringBuilder minifiedSource = new StringBuilder();

    private int charCounter = 0;

    @Override
    public void enterInternalVariable(InternalVariableContext context)
    {
        context.INTERNALVARIABLE().getSymbol();
    }

    @Override
    public void visitTerminal(TerminalNode node)
    {
        switch(node.getSymbol().getType())
        {
            case YololParser.EOF:
                break;
            case YololParser.SPACE:
                minifiedSource.append(" ");
                break;
            case YololParser.LBRACKET:
                minifiedSource.append("(");
                break;
            case YololParser.RBRACKET:
                minifiedSource.append(")");
                break;
            case YololParser.INTERNALVARIABLE:
                if(varMap.containsKey(node.getText()))
                    minifiedSource.append(varMap.get(node.getText()));
                else
                {
                    String newName = getNewVarname();
                    varMap.putIfAbsent(node.getText(), newName);
                    minifiedSource.append(newName);
                }
                break;
            default:
                minifiedSource.append(node.getText());
        }
    }

    private String getNewVarname()
    {
        StringBuilder varBuilder = new StringBuilder();
        varBuilder.append((char)(charCounter%26 + 97));
        for(int i = charCounter / 26; i != 0; i /= 26)
            varBuilder.append((char)(i % 26 + 97));

        ++charCounter;
        return varBuilder.reverse().toString();
    }

    public String getMinifiedSource()
    {
        return minifiedSource.toString();
    }

    public Map<String, String> getVariableMap()
    {
        return varMap;
    }
}
