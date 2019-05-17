/** 
 * Project Name:designpattern 
 * File Name:FactoryProducer.java 
 * Package Name:abstractfactorypattern.demo 
 * Date:2017年6月11日下午3:10:57 
 * sky.zyl@hotmail.com
 * 
*/

package abstractfactorypattern.demo;

/**
 * ClassName:FactoryProducer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午3:10:57 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
