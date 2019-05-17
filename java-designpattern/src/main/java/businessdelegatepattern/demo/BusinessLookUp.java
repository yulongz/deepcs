/** 
 * Project Name:designpattern 
 * File Name:BusinessLookUp.java 
 * Package Name:businessdelegatepattern.demo 
 * Date:2017年6月19日上午9:43:12 
 * sky.zyl@hotmail.com
 * 
*/

package businessdelegatepattern.demo;

/**
 * ClassName:BusinessLookUp <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:43:12 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
