package me.buhuan.stone;

import java.io.IOException;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/4下午11:11
 */
public class ParseException extends Exception{

    public ParseException(Token t) {
        this("", t);
    }

    public ParseException(String msg, Token t) {
        super("syntax error around" + msg);
    }

    private static String Location(Token t) {
        if (Token.EOF == t) {
            return "the last line";
        } else {
            return "\"" + t.getText() + "\" at line" + t.getLineNumber();
        }
    }

    public ParseException(IOException e) {
        super(e);
    }

    public ParseException(String msg) {
        super(msg);
    }

}
