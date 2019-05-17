/** 
 * Project Name:designpattern 
 * File Name:FilterManager.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:09:28 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

/**
 * ClassName:FilterManager <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:09:28 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class FilterManager {
	FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
