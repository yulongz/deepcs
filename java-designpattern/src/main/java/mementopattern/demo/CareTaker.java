/** 
 * Project Name:designpattern 
 * File Name:CareTaker.java 
 * Package Name:mediatorpattern.demo 
 * Date:2017年6月16日下午4:48:06 
 * sky.zyl@hotmail.com
 * 
*/

package mementopattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CareTaker <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:48:06 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}

}
