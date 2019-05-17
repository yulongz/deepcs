/** 
 * Project Name:designpattern 
 * File Name:ColorFactory.java 
 * Package Name:abstractfactorypattern.demo 
 * Date:2017年6月11日下午3:10:16 
 * sky.zyl@hotmail.com
 * 
*/

package abstractfactorypattern.demo;

/**
 * ClassName:ColorFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午3:10:16 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}
