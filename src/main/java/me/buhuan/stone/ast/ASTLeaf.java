package me.buhuan.stone.ast;

import me.buhuan.stone.core.Token;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午11:23
 */
public class ASTLeaf extends ASTree{

    private static ArrayList<ASTree> empty = new ArrayList<>();
    protected Token token;
    public ASTLeaf(Token token) {
        this.token = token;
    }

    @Override
    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int numChildren() {
        return 0;
    }

    @Override
    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    public String location() {
        return "at line" + token.getLineNumber();
    }

    public String toString() {
        return token.getText();
    }
    public Token token() {
        return token;
    }
}
