/** 
 * Project Name:designpattern 
 * File Name:AbstractLogger.java 
 * Package Name:chainofresponsibilitypattern.demo 
 * Date:2017年6月16日上午11:04:21 
 * sky.zyl@hotmail.com
 * 
*/  
  
package chainofresponsibilitypattern.demo;  
/** 
 * ClassName:AbstractLogger <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 上午11:04:21 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public abstract class AbstractLogger {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	//责任链中的下一个元素
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level,String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}
	
	abstract protected void write(String message);

}
 