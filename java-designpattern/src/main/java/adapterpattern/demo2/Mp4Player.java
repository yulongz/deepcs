package adapterpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/20
 */
public class Mp4Player implements Player{
    public void play(String name){
        System.out.println("mp4 play "+name);
    }
}
