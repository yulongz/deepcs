/** 
 * Project Name:designpattern 
 * File Name:AndCriteria.java 
 * Package Name:filterpattern.demo 
 * Date:2017年6月13日下午10:15:54 
 * sky.zyl@hotmail.com
 * 
*/

package filterpattern.demo;

import java.util.List;

/**
 * ClassName:AndCriteria <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午10:15:54 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
