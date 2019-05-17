/** 
 * Project Name:designpattern 
 * File Name:Circle.java 
 * Package Name:prototypepattern.demo 
 * Date:2017年6月11日下午8:40:12 
 * sky.zyl@hotmail.com
 * 
*/

package prototypepattern.demo;

/**
 * ClassName:Circle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午8:40:12 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
