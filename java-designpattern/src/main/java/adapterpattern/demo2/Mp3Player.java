package adapterpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/20
 */
public class Mp3Player implements Player{

    public void play(String name){
        System.out.println("mp3 play "+name);
    }
}
