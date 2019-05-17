/** 
 * Project Name:designpattern 
 * File Name:BuyStock.java 
 * Package Name:commandpattern.demo 
 * Date:2017年6月16日下午12:52:51 
 * sky.zyl@hotmail.com
 * 
*/  
  
package commandpattern.demo;  
/** 
 * ClassName:BuyStock <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午12:52:51 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class BuyStock implements Order{
	
	private Stock abcStock;
	
	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}
	
	public void execute(){
		abcStock.bug();
	}

}
 