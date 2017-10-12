package me.buhuan.stone;

import me.buhuan.stone.ast.ASTLeaf;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午11:33
 */
public class NumberLiteral extends ASTLeaf {

    public NumberLiteral(Token token) {
        super(token);
    }

    public int value() {
        return token().getLineNumber();
    }
}
