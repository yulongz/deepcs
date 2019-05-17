/** 
 * Project Name:designpattern 
 * File Name:AdvancedMediaPlayer.java 
 * Package Name:adapterpattern.demo 
 * Date:2017年6月12日下午11:02:48 
 * sky.zyl@hotmail.com
 * 
*/  
  
package adapterpattern.demo;  
/** 
 * ClassName:AdvancedMediaPlayer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月12日 下午11:02:48 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface AdvancedMediaPlayer {
	public void playVlc(String fileName);
	public void playMp4(String fileName);
}
 