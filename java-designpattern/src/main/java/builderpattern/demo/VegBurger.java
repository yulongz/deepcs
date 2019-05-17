/** 
 * Project Name:designpattern 
 * File Name:VegBurger.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:27:51 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:VegBurger <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:27:51 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class VegBurger extends Burger {

	public VegBurger() {
	}

	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
 