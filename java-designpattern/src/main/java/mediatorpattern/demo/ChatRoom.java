/** 
 * Project Name:designpattern 
 * File Name:ChatRoom.java 
 * Package Name:mediatorpattern.demo 
 * Date:2017年6月16日下午4:25:25 
 * sky.zyl@hotmail.com
 * 
*/

package mediatorpattern.demo;

import java.util.Date;

/**
 * ClassName:ChatRoom <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:25:25 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] :" + message);
	}
}
