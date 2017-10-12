package me.buhuan.stone.ast;

import me.buhuan.stone.core.Token;

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
