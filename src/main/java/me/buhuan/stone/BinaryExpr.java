package me.buhuan.stone;

import me.buhuan.stone.ast.ASTLeaf;
import me.buhuan.stone.ast.ASTList;
import me.buhuan.stone.ast.ASTree;

import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午11:35
 */
public class BinaryExpr extends ASTList {
    public BinaryExpr(List<ASTree> list) {
        super(list);
    }

    public ASTree left() {
        return child(0);
    }

    public String operator() {
        return ((ASTLeaf)child(1)).token().getText();
    }

    public ASTree right() {
        return child(2);
    }
}
