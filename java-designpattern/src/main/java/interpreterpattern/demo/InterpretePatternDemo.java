/** 
 * Project Name:designpattern 
 * File Name:InterpretePatternDemo.java 
 * Package Name:interpreterpattern.demo 
 * Date:2017年6月16日下午3:26:42 
 * sky.zyl@hotmail.com
 * 
*/

package interpreterpattern.demo;

/**
 * ClassName:InterpretePatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午3:26:42 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class InterpretePatternDemo {
	// 规则：Rebort和John是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Rebort");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// 规则：Julie是一个已婚女性
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
