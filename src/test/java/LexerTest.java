import me.buhuan.stone.Lexer;
import me.buhuan.stone.ParseException;
import me.buhuan.stone.Token;
import org.junit.Test;

import java.io.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午9:50
 */

public class LexerTest {

    @Test
    public void test() throws FileNotFoundException, ParseException {
        Reader reader = new LineNumberReader(new FileReader(new File("/Users/hbh/Documents/stone/src/test/java/test")));
        Lexer lexer = new Lexer(reader);
        for (Token t; (t = lexer.read()) != Token.EOF;) {
            System.out.println("=>" + t.getText());
        }
    }
}
