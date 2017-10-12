package me.buhuan.stone;

import java.util.Iterator;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/5下午10:40
 */
public abstract class ASTree implements Iterable<ASTree> {

    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    public Iterator<ASTree> iterator() {
        return children();
    }

}
