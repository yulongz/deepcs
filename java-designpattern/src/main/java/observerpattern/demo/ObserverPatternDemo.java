/** 
 * Project Name:designpattern 
 * File Name:ObserverPatternDemo.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:32:10 
 * sky.zyl@hotmail.com
 * 
*/

package observerpattern.demo;

/**
 * ClassName:ObserverPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:32:10 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
