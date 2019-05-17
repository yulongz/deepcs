/** 
 * Project Name:designpattern 
 * File Name:InterceptingFilterDemo.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:10:14 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

/**
 * ClassName:InterceptingFilterDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:10:14 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class InterceptingFilterDemo {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
