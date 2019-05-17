/** 
 * Project Name:designpattern 
 * File Name:Circle.java 
 * Package Name:bridgepattern.demo 
 * Date:2017年6月13日下午7:15:06 
 * sky.zyl@hotmail.com
 * 
*/  
  
package bridgepattern.demo;

/** 
 * ClassName:Circle <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月13日 下午7:15:06 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Circle extends Shape {

	private int x,y,radius;
	
	protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}


}
 