package builderpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Product productA = builder.createA();
        productA.show();

        Product productB = builder.createB();
        productB.show();

        Product a = builder.create("A");
        a.show();

        Product b = builder.create("B");
        b.show();
    }
}
