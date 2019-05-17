/** 
 * Project Name:designpattern 
 * File Name:Circle.java 
 * Package Name:flyweightpattern.demo 
 * Date:2017年6月14日下午12:44:29 
 * sky.zyl@hotmail.com
 * 
*/

package flyweightpattern.demo;

/**
 * ClassName:Circle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月14日 下午12:44:29 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
}
