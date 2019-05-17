/** 
 * Project Name:designpattern 
 * File Name:NullPatternDemo.java 
 * Package Name:nullobjectpattern.demo 
 * Date:2017年6月16日下午7:06:14 
 * sky.zyl@hotmail.com
 * 
*/

package nullobjectpattern.demo;

/**
 * ClassName:NullPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午7:06:14 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class NullPatternDemo {

	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());

	}

}
