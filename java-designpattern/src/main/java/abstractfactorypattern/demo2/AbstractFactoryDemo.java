package abstractfactorypattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory concreteAFactory = new ConcreteAFactory();
        concreteAFactory.getColor().show();
        concreteAFactory.getShape().show();

        AbstractFactory concreteBFactory = new ConcreteBFactory();
        concreteBFactory.getColor().show();
        concreteBFactory.getShape().show();
    }
}
