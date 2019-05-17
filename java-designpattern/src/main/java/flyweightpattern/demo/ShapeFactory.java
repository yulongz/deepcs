/** 
 * Project Name:designpattern 
 * File Name:ShapeFactory.java 
 * Package Name:flyweightpattern.demo 
 * Date:2017年6月14日下午12:45:48 
 * sky.zyl@hotmail.com
 * 
*/

package flyweightpattern.demo;

import java.util.HashMap;

/**
 * ClassName:ShapeFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月14日 下午12:45:48 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
