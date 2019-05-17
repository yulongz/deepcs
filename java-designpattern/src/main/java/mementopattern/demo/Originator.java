/** 
 * Project Name:designpattern 
 * File Name:Originator.java 
 * Package Name:mementopattern.demo 
 * Date:2017年6月16日下午4:45:06 
 * sky.zyl@hotmail.com
 * 
*/

package mementopattern.demo;

/**
 * ClassName:Originator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:45:06 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}
}
