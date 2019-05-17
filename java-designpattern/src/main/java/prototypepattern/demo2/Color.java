package prototypepattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public abstract class Color implements Cloneable{

    abstract void show();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
