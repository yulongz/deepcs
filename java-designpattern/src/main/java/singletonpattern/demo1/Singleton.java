/** 
 * Project Name:designpattern 
 * File Name:Singleton.java 
 * Package Name:singletonpattern.demo 
 * Date:2017年6月9日下午8:09:27 
 * sky.zyl@hotmail.com
 * 
*/

package singletonpattern.demo1;

/**
 * ClassName:Singleton <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月9日 下午8:09:27 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
//懒汉式
//所谓"懒汉式"与"饿汉式"的区别，是在与建立单例对象的时间的不同。
//"懒汉式"是在你真正用到的时候才去建这个单例对象
//"饿汉式"是在不管你用的用不上，一开始就建立这个单例对象
//是否 Lazy 初始化：是
//是否多线程安全：否
//实现难度：易
//描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
//这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("singleton");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void show() {
		System.out.println("hello singleton");
	}
}
