/** 
 * Project Name:designpattern 
 * File Name:Broker.java 
 * Package Name:commandpattern.demo 
 * Date:2017年6月16日下午12:56:31 
 * sky.zyl@hotmail.com
 * 
*/  
  
package commandpattern.demo;

import java.util.ArrayList;
import java.util.List;

/** 
 * ClassName:Broker <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午12:56:31 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order){
		orderList.add(order);
	}
	
	public void placeOrders(){
		for(Order order:orderList){
			order.execute();
		}
		orderList.clear();
	}
}
 