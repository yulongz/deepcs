/** 
 * Project Name:designpattern 
 * File Name:CriteriaMale.java 
 * Package Name:filterpattern.demo 
 * Date:2017年6月13日下午10:09:21 
 * sky.zyl@hotmail.com
 * 
*/

package filterpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CriteriaMale <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午10:09:21 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
