/** 
 * Project Name:designpattern 
 * File Name:ConsoleLogger.java 
 * Package Name:chainofresponsibilitypattern.demo 
 * Date:2017年6月16日上午11:09:06 
 * sky.zyl@hotmail.com
 * 
*/

package chainofresponsibilitypattern.demo;

/**
 * ClassName:ConsoleLogger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 上午11:09:06 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	protected void write(String message) {
		System.out.println("Standard Console:Logger: " + message);
	}
}
