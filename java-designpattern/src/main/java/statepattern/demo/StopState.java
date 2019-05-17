/** 
 * Project Name:designpattern 
 * File Name:StopState.java 
 * Package Name:statepattern.demo 
 * Date:2017年6月16日下午5:46:22 
 * sky.zyl@hotmail.com
 * 
*/

package statepattern.demo;

/**
 * ClassName:StopState <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午5:46:22 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
