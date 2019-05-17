package prototypepattern.demo2;

import java.util.HashMap;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public class ColorCreator {
    public static HashMap hashMap = new HashMap<String,Color>();

    private Color RED;
    private Color BLUE;
    public ColorCreator(){
        RED = new Red();
        BLUE = new Blue();
        loadColor();
    }

    public Color getRED(){
        return RED;
    }

    public Color getBLUE(){
        return BLUE;
    }

    public Color createRed(){
        return (Color) RED.clone();
    }

    public Color createBlue(){
        return (Color) BLUE.clone();
    }

    public Color getColor(String string){
        Color color = (Color) hashMap.get(string);
        return (Color) color.clone();
    }

    public void loadColor(){
        hashMap.put("GREEN",new Green());
        hashMap.put("WHITE",new White());
    }
}
