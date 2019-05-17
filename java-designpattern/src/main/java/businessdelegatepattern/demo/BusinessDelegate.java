/** 
 * Project Name:designpattern 
 * File Name:BusinessDelegate.java 
 * Package Name:businessdelegatepattern.demo 
 * Date:2017年6月19日上午9:43:56 
 * sky.zyl@hotmail.com
 * 
*/

package businessdelegatepattern.demo;

/**
 * ClassName:BusinessDelegate <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:43:56 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
