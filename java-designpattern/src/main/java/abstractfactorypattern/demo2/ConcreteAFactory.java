package abstractfactorypattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ConcreteAFactory implements AbstractFactory{
    public ConcreteAFactory() {
        System.out.println("ConcreteAFactory");
    }

    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Shape getShape() {
        return new Cicle();
    }
}
