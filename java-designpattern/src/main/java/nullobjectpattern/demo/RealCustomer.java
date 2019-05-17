/** 
 * Project Name:designpattern 
 * File Name:RealCustomer.java 
 * Package Name:nullobjectpattern.demo 
 * Date:2017年6月16日下午6:56:26 
 * sky.zyl@hotmail.com
 * 
*/  
  
package nullobjectpattern.demo;  
/** 
 * ClassName:RealCustomer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午6:56:26 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class RealCustomer extends AbstractCustomer{
	
	public RealCustomer(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isNil(){
		return false;
	}

}
 