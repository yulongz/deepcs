/** 
 * Project Name:designpattern 
 * File Name:RedCircle.java 
 * Package Name:bridgepattern.demo 
 * Date:2017年6月13日下午7:08:24 
 * sky.zyl@hotmail.com
 * 
*/

package bridgepattern.demo;

/**
 * ClassName:RedCircle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午7:08:24 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class RedCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red,radius: " + radius + ", x: " + x + "," + y + "]");
	}
}
