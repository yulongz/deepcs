/** 
 * Project Name:designpattern 
 * File Name:IteratorPatternDemo.java 
 * Package Name:iteratorpattern.demo 
 * Date:2017年6月16日下午4:18:13 
 * sky.zyl@hotmail.com
 * 
*/

package iteratorpattern.demo;

/**
 * ClassName:IteratorPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月16日 下午4:18:13 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name :　" + name);
		}
	}
}
