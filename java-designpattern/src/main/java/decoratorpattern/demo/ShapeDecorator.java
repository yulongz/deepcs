/** 
 * Project Name:designpattern 
 * File Name:ShapeDecorator.java 
 * Package Name:decoratorpattern.demo 
 * Date:2017年6月13日下午11:47:18 
 * sky.zyl@hotmail.com
 * 
*/

package decoratorpattern.demo;

/**
 * ClassName:ShapeDecorator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午11:47:18 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
