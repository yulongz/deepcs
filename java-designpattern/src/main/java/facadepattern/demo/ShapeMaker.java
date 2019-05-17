/** 
 * Project Name:designpattern 
 * File Name:ShapeMaker.java 
 * Package Name:facadepattern.demo 
 * Date:2017年6月14日下午12:21:29 
 * sky.zyl@hotmail.com
 * 
*/  
  
package facadepattern.demo;  
/** 
 * ClassName:ShapeMaker <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月14日 下午12:21:29 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}

}
 