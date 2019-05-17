/** 
 * Project Name:designpattern 
 * File Name:BusinessDelegatePatternDemo.java 
 * Package Name:businessdelegatepattern.demo 
 * Date:2017年6月19日上午9:44:31 
 * sky.zyl@hotmail.com
 * 
*/

package businessdelegatepattern.demo;

/**
 * ClassName:BusinessDelegatePatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:44:31 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
