/** 
 * Project Name:designpattern 
 * File Name:Singleton.java 
 * Package Name:singletonpattern.demo4 
 * Date:2017年6月10日下午6:00:02 
 * sky.zyl@hotmail.com
 * 
*/

package singletonpattern.demo4;

/**
 * ClassName:Singleton <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月10日 下午6:00:02 <br/>
 * 
 * @author Yulong
 * @version
 * @since JDK 1.7
 * @see
 */
//双检锁/双重校验锁(DCL,即 double-checked locking)

//JDK 版本：JDK1.5 起
//是否 Lazy 初始化：是
//是否多线程安全：是
//实现难度：较复杂
//描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
//getInstance() 的性能对应用程序很关键。

public class Singleton {
//volatile关键词确保:当instance变量被初始化成Singleton实例时，多个线程正确地处理instance变量
//作为Java中的轻量级锁，当多线程中一个线程操作后可以保证其他线程可见，也就是书上所说的“可见性”，另外一个就是“重排序”。所谓重排序指的是JVM对指令的优化。
	private volatile static Singleton instance;

	private Singleton() {
		System.out.println("singleton");
	}

	public static Singleton getInstance() {
		//检查实例，如果不存在就进入同步区块
		if (instance == null) {
			//注意这里只有第一次才彻底执行这里的代码
			synchronized (Singleton.class) {
				//进入区块后，再检查一次，如果仍是null，才创建实例
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void show() {
		System.out.println("hello singleton");
	}
}
