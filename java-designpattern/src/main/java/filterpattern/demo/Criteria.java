/** 
 * Project Name:designpattern 
 * File Name:Criteria.java 
 * Package Name:filterpattern.demo 
 * Date:2017年6月13日下午10:08:39 
 * sky.zyl@hotmail.com
 * 
*/  
  
package filterpattern.demo;

import java.util.List;

/** 
 * ClassName:Criteria <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年6月13日 下午10:08:39 <br/> 
 * @author   "Yulong Zhang" 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface Criteria {
	   public List<Person> meetCriteria(List<Person> persons);

}
 