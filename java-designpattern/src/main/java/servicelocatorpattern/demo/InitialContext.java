/** 
 * Project Name:designpattern 
 * File Name:InitialContext.java 
 * Package Name:servicelocatorpattern.demo 
 * Date:2017年6月19日上午10:16:42 
 * sky.zyl@hotmail.com
 * 
*/

package servicelocatorpattern.demo;

/**
 * ClassName:InitialContext <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:16:42 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
