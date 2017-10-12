package me.buhuan.stone;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/4下午9:44
 */
public class Token {

    // 文件末尾
    public static final Token EOF = new Token(-1);
    // 句尾
    public static final String EOL = "\\n";
    private int lineNumber;

    protected Token(int line) {
        this.lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new StoneException("not number token");
    }

    public String getText() {
        return "";
    }

}
