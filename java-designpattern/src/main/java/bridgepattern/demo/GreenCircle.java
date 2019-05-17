/** 
 * Project Name:designpattern 
 * File Name:GreenCircle.java 
 * Package Name:bridgepattern.demo 
 * Date:2017年6月13日下午7:10:08 
 * sky.zyl@hotmail.com
 * 
*/

package bridgepattern.demo;

/**
 * ClassName:GreenCircle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午7:10:08 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class GreenCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + "," + y + "]");
	}

}
