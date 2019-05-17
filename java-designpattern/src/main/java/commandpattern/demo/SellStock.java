/** 
 * Project Name:designpattern 
 * File Name:SellStock.java 
 * Package Name:commandpattern.demo 
 * Date:2017年6月16日下午12:54:39 
 * sky.zyl@hotmail.com
 * 
*/  
  
package commandpattern.demo;  
/** 
 * ClassName:SellStock <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午12:54:39 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class SellStock implements Order{
	private Stock abcStock;
	
	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}
	
	public void execute(){
		abcStock.sell();
	}

}
 