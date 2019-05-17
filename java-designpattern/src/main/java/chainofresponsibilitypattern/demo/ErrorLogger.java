/** 
 * Project Name:designpattern 
 * File Name:ErrorLogger.java 
 * Package Name:chainofresponsibilitypattern.demo 
 * Date:2017年6月16日上午11:16:18 
 * sky.zyl@hotmail.com
 * 
*/

package chainofresponsibilitypattern.demo;

/**
 * ClassName:ErrorLogger <br/>
 * Reason: TODO ADD REASON. <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年6月16日 上午11:16:18 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
