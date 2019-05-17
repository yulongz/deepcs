/** 
 * Project Name:designpattern 
 * File Name:ServiceLocator.java 
 * Package Name:servicelocatorpattern.demo 
 * Date:2017年6月19日上午10:18:03 
 * sky.zyl@hotmail.com
 * 
*/

package servicelocatorpattern.demo;

/**
 * ClassName:ServiceLocator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:18:03 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ServiceLocator {

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
