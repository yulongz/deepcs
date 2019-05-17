/** 
 * Project Name:designpattern 
 * File Name:Rectangle.java 
 * Package Name:prototypepattern.demo 
 * Date:2017年6月11日下午8:36:49 
 * sky.zyl@hotmail.com
 * 
*/

package prototypepattern.demo;

/**
 * ClassName:Rectangle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午8:36:49 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
