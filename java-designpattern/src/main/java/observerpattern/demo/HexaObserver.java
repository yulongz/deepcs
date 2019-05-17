/** 
 * Project Name:designpattern 
 * File Name:HexaObserver.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:26:58 
 * sky.zyl@hotmail.com
 * 
*/

package observerpattern.demo;

/**
 * ClassName:HexaObserver <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:26:58 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}

}
