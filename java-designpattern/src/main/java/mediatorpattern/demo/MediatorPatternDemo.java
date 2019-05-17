/** 
 * Project Name:designpattern 
 * File Name:MediatorPatternDemo.java 
 * Package Name:mediatorpattern.demo 
 * Date:2017年6月16日下午4:30:43 
 * sky.zyl@hotmail.com
 * 
*/

package mediatorpattern.demo;

/**
 * ClassName:MediatorPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:30:43 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi!John!");
		john.sendMessage("Hello!Robert!");
	}

}
