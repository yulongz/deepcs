/** 
 * Project Name:designpattern 
 * File Name:BridgePatternDemo.java 
 * Package Name:bridgepattern.demo 
 * Date:2017年6月13日下午7:17:29 
 * sky.zyl@hotmail.com
 * 
*/

package bridgepattern.demo;

/**
 * ClassName:BridgePatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午7:17:29 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();

	}

}
