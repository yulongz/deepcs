/** 
 * Project Name:designpattern 
 * File Name:Pepsi.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:31:34 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:Pepsi <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:31:34 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Pepsi extends ColdDrink {

	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
 