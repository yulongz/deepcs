/** 
 * Project Name:designpattern 
 * File Name:Singleton.java 
 * Package Name:singletonpattern.demo2 
 * Date:2017年6月10日下午5:44:51 
 * sky.zyl@hotmail.com
 * 
*/

package singletonpattern.demo2;

/**
 * ClassName:Singleton <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月10日 下午5:44:51 <br/>
 * 
 * @author Yulong
 * @version
 * @since JDK 1.7
 * @see
 */
//懒汉式
//所谓"懒汉式"与"饿汉式"的区别，是在与建立单例对象的时间的不同。
//"懒汉式"是在你真正用到的时候才去建这个单例对象
//"饿汉式"是在不管你用的用不上，一开始就建立这个单例对象
// 是否 Lazy 初始化：是
// 是否多线程安全：是
// 实现难度：易
// 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
// 优点：第一次调用才初始化，避免内存浪费。
// 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
// getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("singleton");
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void show() {
		System.out.println("hello singleton");
	}
}
