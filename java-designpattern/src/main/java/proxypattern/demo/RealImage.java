/** 
 * Project Name:designpattern 
 * File Name:RealImage.java 
 * Package Name:proxypattern.demo 
 * Date:2017年6月15日下午5:52:25 
 * sky.zyl@hotmail.com
 * 
*/

package proxypattern.demo;

/**
 * ClassName:RealImage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月15日 下午5:52:25 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

	public void display() {
		System.out.println("Displaying  " + fileName);
	}

}
