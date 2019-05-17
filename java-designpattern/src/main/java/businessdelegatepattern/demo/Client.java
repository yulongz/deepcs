/** 
 * Project Name:designpattern 
 * File Name:Client.java 
 * Package Name:businessdelegatepattern.demo 
 * Date:2017年6月19日上午9:44:11 
 * sky.zyl@hotmail.com
 * 
*/

package businessdelegatepattern.demo;

/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:44:11 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
