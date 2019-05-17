/** 
 * Project Name:designpattern 
 * File Name:NameRepository.java 
 * Package Name:iteratorpattern.demo 
 * Date:2017年6月16日下午4:11:17 
 * sky.zyl@hotmail.com
 * 
*/  
  
package iteratorpattern.demo;  
/** 
 * ClassName:NameRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月16日 下午4:11:17 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class NameRepository implements Container{
	
	public String names[] = {"Robert","John","Julie","Lora"};
	
	public Iterator getIterator(){
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
		
		int index;
		
		public boolean hasNext(){
			if(index < names.length){
				return true;
			}
			return false;
		}
		
		public Object next(){
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}
		
	}

}
 