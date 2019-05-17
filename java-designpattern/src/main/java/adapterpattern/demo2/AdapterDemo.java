package adapterpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/20
 */
public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play("mp3","Little Star");
        mediaPlayer.play("mp4","BraveHeart");
    }
}
