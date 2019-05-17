/** 
 * Project Name:designpattern 
 * File Name:ServiceLocatorPatternDemo.java 
 * Package Name:servicelocatorpattern.demo 
 * Date:2017年6月19日上午10:18:43 
 * sky.zyl@hotmail.com
 * 
*/

package servicelocatorpattern.demo;

/**
 * ClassName:ServiceLocatorPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:18:43 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
