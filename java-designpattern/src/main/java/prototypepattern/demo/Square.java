/** 
 * Project Name:designpattern 
 * File Name:Square.java 
 * Package Name:prototypepattern.demo 
 * Date:2017年6月11日下午8:39:40 
 * sky.zyl@hotmail.com
 * 
*/

package prototypepattern.demo;

/**
 * ClassName:Square <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午8:39:40 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
