import com.yok.parser.YokLexer;
import com.yok.parser.YokParser;
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
		try
		{
			input = new ANTLRInputStream(Files.readString(Paths.get("testing.yorofl")).toLowerCase());
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
			return;
		}

		YokLexer          lexer  = new YokLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		YokParser         parser = new YokParser(tokens);

		ParseTree         tree     = parser.chip();
		ParseTreeWalker   walker   = new ParseTreeWalker();
		CustomYokListener listener = new CustomYokListener();

		walker.walk(listener, tree);
	}
}