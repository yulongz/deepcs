/** 
 * Project Name:designpattern 
 * File Name:Memento.java 
 * Package Name:mementopattern.demo 
 * Date:2017年6月16日下午4:43:57 
 * sky.zyl@hotmail.com
 * 
*/

package mementopattern.demo;

/**
 * ClassName:Memento <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:43:57 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
