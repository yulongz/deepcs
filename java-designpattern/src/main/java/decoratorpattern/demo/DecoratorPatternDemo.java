/** 
 * Project Name:designpattern 
 * File Name:DecoratorPatternDemo.java 
 * Package Name:decoratorpattern.demo 
 * Date:2017年6月13日下午11:49:08 
 * sky.zyl@hotmail.com
 * 
*/

package decoratorpattern.demo;

/**
 * ClassName:DecoratorPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午11:49:08 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}
