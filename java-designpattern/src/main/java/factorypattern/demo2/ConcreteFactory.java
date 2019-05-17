package factorypattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ConcreteFactory implements Factory {
    @Override
    public Color create() {
        return new Red();
    }
}
