/** 
 * Project Name:designpattern 
 * File Name:Context.java 
 * Package Name:statepattern.demo 
 * Date:2017年6月16日下午5:42:54 
 * sky.zyl@hotmail.com
 * 
*/

package statepattern.demo;

/**
 * ClassName:Context <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:42:54 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
