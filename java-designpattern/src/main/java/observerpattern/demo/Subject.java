/** 
 * Project Name:designpattern 
 * File Name:Subject.java 
 * Package Name:observerpattern.demo 
 * Date:2017年6月16日下午5:14:19 
 * sky.zyl@hotmail.com
 * 
*/

package observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Subject <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:14:19 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
