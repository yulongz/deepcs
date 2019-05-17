/** 
 * Project Name:designpattern 
 * File Name:CommandPatternDemo.java 
 * Package Name:commandpattern.demo 
 * Date:2017年6月16日下午2:10:30 
 * sky.zyl@hotmail.com
 * 
*/  
  
package commandpattern.demo;  
/** 
 * ClassName:CommandPatternDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午2:10:30 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class CommandPatternDemo {
	
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}
}
 