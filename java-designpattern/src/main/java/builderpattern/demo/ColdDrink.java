/** 
 * Project Name:designpattern 
 * File Name:ColdDrink.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:24:09 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:ColdDrink <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:24:09 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
 