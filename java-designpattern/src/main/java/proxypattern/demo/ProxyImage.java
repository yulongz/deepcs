/** 
 * Project Name:designpattern 
 * File Name:ProxyImage.java 
 * Package Name:proxypattern.demo 
 * Date:2017年6月16日上午10:36:06 
 * sky.zyl@hotmail.com
 * 
*/  
  
package proxypattern.demo;  
/** 
 * ClassName:ProxyImage <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 上午10:36:06 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ProxyImage implements Image {
	
	private RealImage realImage;
	
	private String fileName;
	
	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
 