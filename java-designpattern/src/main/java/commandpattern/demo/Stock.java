/** 
 * Project Name:designpattern 
 * File Name:Stock.java 
 * Package Name:commandpattern.demo 
 * Date:2017年6月16日下午12:50:00 
 * sky.zyl@hotmail.com
 * 
*/

package commandpattern.demo;

/**
 * ClassName:Stock <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午12:50:00 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void bug() {
		System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] bought");
	}

	public void sell() {
		System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}
