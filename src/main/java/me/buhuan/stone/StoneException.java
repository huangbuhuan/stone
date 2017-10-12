package me.buhuan.stone;

import com.sun.source.tree.AssertTree;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/7/4下午9:47
 */
public class StoneException extends RuntimeException{

    public StoneException(String msg) {
        super(msg);
    }

    public StoneException(String msg, AssertTree tree) {
        super(msg + " ");
    }
}
