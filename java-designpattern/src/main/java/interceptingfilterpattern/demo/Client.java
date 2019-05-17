/** 
 * Project Name:designpattern 
 * File Name:Client.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:09:57 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:09:57 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
