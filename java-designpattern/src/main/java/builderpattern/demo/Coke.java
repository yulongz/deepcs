/** 
 * Project Name:designpattern 
 * File Name:Coke.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:30:40 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:Coke <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:30:40 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
 