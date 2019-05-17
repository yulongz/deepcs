package factorypattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        factory.create().show();
    }
}
