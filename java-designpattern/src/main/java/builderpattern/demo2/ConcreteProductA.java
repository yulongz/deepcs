package builderpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ConcreteProductA implements Product {
    @Override
    public void show() {
        System.out.println("This is a ConcreteProductA!");
    }
}
