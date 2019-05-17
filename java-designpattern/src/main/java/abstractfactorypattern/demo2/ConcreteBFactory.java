package abstractfactorypattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ConcreteBFactory implements AbstractFactory{
    public ConcreteBFactory() {
        System.out.println("ConcreteBFactory");
    }

    @Override
    public Color getColor() {
        return new Blue();
    }

    @Override
    public Shape getShape() {
        return new Square();
    }
}
