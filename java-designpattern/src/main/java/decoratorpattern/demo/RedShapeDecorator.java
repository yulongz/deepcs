/** 
 * Project Name:designpattern 
 * File Name:RedShapeDecorator.java 
 * Package Name:decoratorpattern.demo 
 * Date:2017年6月13日下午11:47:50 
 * sky.zyl@hotmail.com
 * 
*/

package decoratorpattern.demo;

/**
 * ClassName:RedShapeDecorator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午11:47:50 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
