package builderpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ConcreteBuilder implements Builder {
    @Override
    public Product create(String choice) {
        if(choice.equalsIgnoreCase("A")) {
            return new ConcreteProductA();
        }
        else if (choice.equalsIgnoreCase("B")){
            return new ConcreteProductB();
        }
        return null;
    }

    @Override
    public Product createA() {
        Product product = new ConcreteProductA();
        return product;
    }

    @Override
    public Product createB() {
        Product product = new ConcreteProductB();
        return product;
    }
}
