/** 
 * Project Name:designpattern 
 * File Name:ProxyPatternDemo.java 
 * Package Name:proxypattern.demo 
 * Date:2017年6月16日上午10:41:23 
 * sky.zyl@hotmail.com
 * 
*/  
  
package proxypattern.demo;  
/** 
 * ClassName:ProxyPatternDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 上午10:41:23 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.jpg");
		
		//图像将从磁盘加载
		image.display();
		System.out.println("");
		
		//图像将无法从磁盘加载
		image.display();

	}

}
 