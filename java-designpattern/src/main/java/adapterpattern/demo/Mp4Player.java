/** 
 * Project Name:designpattern 
 * File Name:Mp4Player.java 
 * Package Name:adapterpattern.demo 
 * Date:2017年6月12日下午11:07:32 
 * sky.zyl@hotmail.com
 * 
*/  
  
package adapterpattern.demo;  
/** 
 * ClassName:Mp4Player <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月12日 下午11:07:32 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Mp4Player implements AdvancedMediaPlayer{

	public void playVlc(String fileName) {
		//nothing
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);
	}

}
 