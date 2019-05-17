/** 
 * Project Name:designpattern 
 * File Name:OctalObserver.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:23:47 
 * sky.zyl@hotmail.com
 * 
*/

package observerpattern.demo;

/**
 * ClassName:OctalObserver <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:23:47 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
