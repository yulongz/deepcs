/** 
 * Project Name:designpattern 
 * File Name:CustomerFactory.java 
 * Package Name:nullobjectpattern.demo 
 * Date:2017年6月16日下午7:00:56 
 * sky.zyl@hotmail.com
 * 
*/  
  
package nullobjectpattern.demo;  
/** 
 * ClassName:CustomerFactory <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午7:00:56 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class CustomerFactory {
	
	public static final String[] names = {"Rob","Joe","Julie"};
	
	public static AbstractCustomer getCustomer(String name){
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}

}
 