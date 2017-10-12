package me.buhuan.stone;

import me.buhuan.stone.ast.ASTLeaf;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午11:34
 */
public class Name extends ASTLeaf {

    public Name(Token token) {
        super(token);
    }

    public String name() {
        return token().getText();
    }
}
