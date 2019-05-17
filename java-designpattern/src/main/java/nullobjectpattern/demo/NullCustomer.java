/** 
 * Project Name:designpattern 
 * File Name:NullCustomer.java 
 * Package Name:nullobjectpattern.demo 
 * Date:2017年6月16日下午6:59:59 
 * sky.zyl@hotmail.com
 * 
*/

package nullobjectpattern.demo;

/**
 * ClassName:NullCustomer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午6:59:59 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class NullCustomer extends AbstractCustomer {

	public boolean isNil() {
		return true;
	}

	public String getName() {
		return "Not Available in Customer Database";
	}

}
