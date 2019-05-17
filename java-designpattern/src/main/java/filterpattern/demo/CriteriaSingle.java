/** 
 * Project Name:designpattern 
 * File Name:CriteriaSingle.java 
 * Package Name:filterpattern.demo 
 * Date:2017年6月13日下午10:14:46 
 * sky.zyl@hotmail.com
 * 
*/

package filterpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CriteriaSingle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午10:14:46 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
