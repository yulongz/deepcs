/** 
 * Project Name:designpattern 
 * File Name:Service1.java 
 * Package Name:servicelocatorpattern.demo 
 * Date:2017年6月19日上午10:14:44 
 * sky.zyl@hotmail.com
 * 
*/  
  
package servicelocatorpattern.demo;  
/** 
 * ClassName:Service1 <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月19日 上午10:14:44 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Service1 implements Service{
	public void execute(){
		System.out.println("Executing Service1");
	}
	
	public String getName(){
		return "Service1";
	}

}
 