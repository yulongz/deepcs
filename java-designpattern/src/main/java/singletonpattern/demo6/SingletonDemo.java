/** 
 * Project Name:designpattern 
 * File Name:SingletonDemo.java 
 * Package Name:singletonpattern.demo 
 * Date:2017年6月9日下午10:14:28 
 * sky.zyl@hotmail.com
 * 
*/

package singletonpattern.demo6;

/**
 * ClassName:SingletonDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月9日 下午10:14:28 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton object = Singleton.INSTANCE;
		object.whateverMethod();
		object.show();
	}
}
