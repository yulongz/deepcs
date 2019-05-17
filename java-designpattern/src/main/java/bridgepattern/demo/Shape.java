/** 
 * Project Name:designpattern 
 * File Name:Shape.java 
 * Package Name:bridgepattern.demo 
 * Date:2017年6月13日下午7:13:35 
 * sky.zyl@hotmail.com
 * 
*/

package bridgepattern.demo;

/**
 * ClassName:Shape <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午7:13:35 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
