/** 
 * Project Name:designpattern 
 * File Name:User.java 
 * Package Name:mediatorpattern.demo 
 * Date:2017年6月16日下午4:27:47 
 * sky.zyl@hotmail.com
 * 
*/

package mediatorpattern.demo;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:27:47 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}

}
