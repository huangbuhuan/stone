package me.buhuan.stone;

import java.util.Iterator;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午11:28
 */
public class ASTList extends ASTree {
    protected List<ASTree> children;

    public ASTList(List<ASTree> list) {
        children = list;
    }

    @Override
    public ASTree child(int i) {
        return children.get(i);
    }

    @Override
    public int numChildren() {
        return children.size();
    }

    @Override
    public Iterator<ASTree> children() {
        return children.iterator();
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        String sep = "";
        for (ASTree t : children) {
            builder.append(sep);
            sep = "";
            builder.append(t.toString());
        }
        return builder.append(')').toString();
    }

    public String location() {
        for (ASTree t : children) {
            String s = t.location();
            if (s != null) {
                return s;
            }
        }
        return null;
    }
}
