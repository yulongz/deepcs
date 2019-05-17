/** 
 * Project Name:designpattern 
 * File Name:TerminalExpression.java 
 * Package Name:interpreterpattern.demo 
 * Date:2017年6月16日下午2:45:02 
 * sky.zyl@hotmail.com
 * 
*/  
  
package interpreterpattern.demo;  
/** 
 * ClassName:TerminalExpression <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午2:45:02 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TerminalExpression implements Expression{
	private String data;
	
	public TerminalExpression(String data){
		this.data = data;
	}
	
	public boolean interpret(String context){
		if(context.contains(data)){
			return true;
		}
		return false;
	}

}
 