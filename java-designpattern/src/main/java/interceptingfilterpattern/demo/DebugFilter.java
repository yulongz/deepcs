/** 
 * Project Name:designpattern 
 * File Name:DebugFilter.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:07:27 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

/**
 * ClassName:DebugFilter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:07:27 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class DebugFilter implements Filter {
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}
