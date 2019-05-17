/** 
 * Project Name:designpattern 
 * File Name:AuthenticationFilter.java 
 * Package Name:interceptingfilterpattern.demo 
 * Date:2017年6月19日上午10:06:37 
 * sky.zyl@hotmail.com
 * 
*/

package interceptingfilterpattern.demo;

/**
 * ClassName:AuthenticationFilter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:06:37 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class AuthenticationFilter implements Filter {

	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
