/** 
 * Project Name:designpattern 
 * File Name:Observer.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:15:50 
 * sky.zyl@hotmail.com
 * 
*/  
  
package observerpattern.demo;  
/** 
 * ClassName:Observer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午5:15:50 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
 