/** 
 * Project Name:designpattern 
 * File Name:Singleton.java 
 * Package Name:singletonpattern.demo6 
 * Date:2017年6月10日下午6:56:25 
 * sky.zyl@hotmail.com
 * 
*/

package singletonpattern.demo6;

import java.io.Serializable;

/**
 * ClassName:Singleton <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月10日 下午6:56:25 <br/>
 * 
 * @author Yulong
 * @version
 * @since JDK 1.7
 * @see
 */
// 枚举

// 是否 Lazy 初始化：否
// 是否多线程安全：是
// 实现难度：易
// 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
// 这种方式是 Effective Java 作者 Josh Bloch
// 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入
// enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
// 不能通过 reflection attack 来调用私有构造方法。

public enum Singleton implements Serializable{
	INSTANCE;
	public void whateverMethod() {
	}

	public void show() {
		System.out.println("hello singleton");
	}
}
