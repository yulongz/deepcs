package builderpattern.demo3;

/**
 * Created by ZhangYulong on 2018/7/23
 */
public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle.Builder(1,1,1).setColor("green").build();
        System.out.println(circle.toString());
    }
}
