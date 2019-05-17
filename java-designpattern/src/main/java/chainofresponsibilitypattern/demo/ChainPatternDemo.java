/** 
 * Project Name:designpattern 
 * File Name:ChainPatternDemo.java 
 * Package Name:chainofresponsibilitypattern.demo 
 * Date:2017年6月16日上午11:45:52 
 * sky.zyl@hotmail.com
 * 
*/  
  
package chainofresponsibilitypattern.demo;  
/** 
 * ClassName:ChainPatternDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 上午11:45:52 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
 