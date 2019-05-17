/** 
 * Project Name:designpattern 
 * File Name:ShapeFactory.java 
 * Package Name:abstractfactorypattern.demo 
 * Date:2017年6月11日下午3:04:09 
 * sky.zyl@hotmail.com
 * 
*/

package abstractfactorypattern.demo;

/**
 * ClassName:ShapeFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午3:04:09 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ShapeFactory extends AbstractFactory {

	Color getColor(String color) {
		return null;
	}

	Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
