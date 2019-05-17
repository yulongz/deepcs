/** 
 * Project Name:designpattern 
 * File Name:VlcPlayer.java 
 * Package Name:adapterpattern.demo 
 * Date:2017年6月12日下午11:04:24 
 * sky.zyl@hotmail.com
 * 
*/  
  
package adapterpattern.demo;  
/** 
 * ClassName:VlcPlayer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月12日 下午11:04:24 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file: "+fileName);
	}

	public void playMp4(String fileName) {
		//nothing
	}

}
 