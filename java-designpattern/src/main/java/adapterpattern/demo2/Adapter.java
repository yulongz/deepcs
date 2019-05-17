package adapterpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/20
 */
public class Adapter{

    private Player player ;

    public Adapter(String type){
        if (type.equalsIgnoreCase("mp3")) {
            player = new Mp3Player();
        } else if (type.equalsIgnoreCase("mp4")) {
            player = new Mp4Player();
        }
    }

    public void play(String name){
        player.play(name);
    }
}
