/** 
 * Project Name:designpattern 
 * File Name:StartState.java 
 * Package Name:statepattern.demo 
 * Date:2017年6月16日下午5:44:57 
 * sky.zyl@hotmail.com
 * 
*/  
  
package statepattern.demo;  
/** 
 * ClassName:StartState <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午5:44:57 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class StartState implements State{
	
	public void doAction(Context context){
		System.out.println("Player is in start state");
		context.setState(this);
	}
	
	public String toString(){
		return "Start State";
	}

}
 