package prototypepattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ColorCreator colorCreator = new ColorCreator();
        Color red = colorCreator.createRed();
        Color blue = colorCreator.createBlue();

        System.out.println("HashCode of Instance-RED is "+red.hashCode());
        System.out.println("HashCode of Instance-BLUE is "+blue.hashCode());

        System.out.println("HashCode of Prototype-RED is "+colorCreator.getRED().hashCode());
        System.out.println("HashCode of Prototype-BLUE is "+colorCreator.getBLUE().hashCode());


        Color green = colorCreator.getColor("GREEN");
        Color white = colorCreator.getColor("WHITE");

        System.out.println("HashCode of Instance-GREEN is "+green.hashCode());
        System.out.println("HashCode of Instance-WHITE is "+white.hashCode());

        System.out.println("HashCode of Prototype-GREEN is "+colorCreator.hashMap.get("GREEN").hashCode());
        System.out.println("HashCode of Prototype-WHITE is "+colorCreator.hashMap.get("WHITE").hashCode());

    }
}
