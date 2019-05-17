package adapterpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/20
 */
public class MediaPlayer {

    public void play(String type,String name){
        new Adapter(type).play(name);
    }

}
