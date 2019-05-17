/** 
 * Project Name:designpattern 
 * File Name:FileLogger.java 
 * Package Name:chainofresponsibilitypattern.demo 
 * Date:2017年6月16日上午11:14:43 
 * sky.zyl@hotmail.com
 * 
*/

package chainofresponsibilitypattern.demo;

/**
 * ClassName:FileLogger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 上午11:14:43 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
