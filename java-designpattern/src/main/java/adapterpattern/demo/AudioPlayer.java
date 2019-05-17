/** 
 * Project Name:designpattern 
 * File Name:AudioPlayer.java 
 * Package Name:adapterpattern.demo 
 * Date:2017年6月12日下午11:14:25 
 * sky.zyl@hotmail.com
 * 
*/

package adapterpattern.demo;

/**
 * ClassName:AudioPlayer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月12日 下午11:14:25 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;

	public void play(String audioType, String fileName) {

		// 播放 mp3 音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// mediaAdapter 提供了播放其他文件格式的支持
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
