/** 
 * Project Name:designpattern 
 * File Name:AdapterPatternDemo.java 
 * Package Name:adapterpattern.demo 
 * Date:2017年6月12日下午11:15:29 
 * sky.zyl@hotmail.com
 * 
*/

package adapterpattern.demo;

/**
 * ClassName:AdapterPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月12日 下午11:15:29 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
