/** 
 * Project Name:designpattern 
 * File Name:Item.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:12:45 
 * sky.zyl@hotmail.com
 * 
*/  
  
package builderpattern.demo;  
/** 
 * ClassName:Item <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月11日 下午4:12:45 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
 