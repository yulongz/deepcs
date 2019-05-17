/** 
 * Project Name:designpattern 
 * File Name:FilterChain.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:08:59 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:FilterChain <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:08:59 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
