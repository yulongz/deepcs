/** 
 * Project Name:designpattern 
 * File Name:JMSService.java 
 * Package Name:businessdelegatepattern.demo 
 * Date:2017年6月19日上午9:42:22 
 * sky.zyl@hotmail.com
 * 
*/

package businessdelegatepattern.demo;

/**
 * ClassName:JMSService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:42:22 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class JMSService implements BusinessService {

	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}
