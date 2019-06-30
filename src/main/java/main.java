import com.yolol.parser.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main
{
	public static void main(String[] args)
	{
		ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(Files.readString(Paths.get("testing.yolol")));
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
			return;
		}
		YololLexer lexer = new YololLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		YololParser parser = new YololParser(tokens);

		ParseTree tree = parser.chip();
		ParseTreeWalker walker = new ParseTreeWalker();
		CustomYololListener listener = new CustomYololListener();
		walker.walk(listener, tree);

		System.out.println(listener.getMinifiedSource());
	}
}