/** 
 * Project Name:designpattern 
 * File Name:StatePatternDemo.java 
 * Package Name:statepattern.demo 
 * Date:2017年6月16日下午5:48:08 
 * sky.zyl@hotmail.com
 * 
*/  
  
package statepattern.demo;  
/** 
 * ClassName:StatePatternDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午5:48:08 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());

	}

}
 