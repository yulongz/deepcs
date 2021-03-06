/** 
 * Project Name:designpattern 
 * File Name:AndExpression.java 
 * Package Name:interpreterpattern.demo 
 * Date:2017年6月16日下午3:23:08 
 * sky.zyl@hotmail.com
 * 
*/

package interpreterpattern.demo;

/**
 * ClassName:AndExpression <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午3:23:08 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class AndExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
