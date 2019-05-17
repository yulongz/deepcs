/** 
 * Project Name:designpattern 
 * File Name:ChickenBurger.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:28:50 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:ChickenBurger <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:28:50 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ChickenBurger extends Burger {

	public ChickenBurger() {
	}
	
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
 