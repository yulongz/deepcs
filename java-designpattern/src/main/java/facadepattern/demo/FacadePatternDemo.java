/** 
 * Project Name:designpattern 
 * File Name:FacadePatternDemo.java 
 * Package Name:facadepattern.demo 
 * Date:2017年6月14日下午12:24:38 
 * sky.zyl@hotmail.com
 * 
*/  
  
package facadepattern.demo;  
/** 
 * ClassName:FacadePatternDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月14日 下午12:24:38 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class FacadePatternDemo {

	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
 