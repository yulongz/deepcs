/** 
 * Project Name:designpattern 
 * File Name:BinaryObserver.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:22:10 
 * sky.zyl@hotmail.com
 * 
*/

package observerpattern.demo;

/**
 * ClassName:BinaryObserver <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:22:10 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
	}

}
