/** 
 * Project Name:designpattern 
 * File Name:CompositeEntityPatternDemo.java 
 * Package Name:compositeentitypattern.demo 
 * Date:2017年6月19日上午9:48:07 
 * sky.zyl@hotmail.com
 * 
*/

package compositeentitypattern.demo;

/**
 * ClassName:CompositeEntityPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:48:07 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CompositeEntityPatternDemo {

	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
