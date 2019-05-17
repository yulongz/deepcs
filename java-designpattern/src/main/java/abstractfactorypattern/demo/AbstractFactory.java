/** 
 * Project Name:designpattern 
 * File Name:AbstractFactory.java 
 * Package Name:abstractfactorypattern.demo 
 * Date:2017年6月11日下午3:01:19 
 * sky.zyl@hotmail.com
 * 
*/

package abstractfactorypattern.demo;

/**
 * ClassName:AbstractFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午3:01:19 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
