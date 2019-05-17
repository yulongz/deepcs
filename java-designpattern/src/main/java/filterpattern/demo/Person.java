/** 
 * Project Name:designpattern 
 * File Name:Person.java 
 * Package Name:filterpattern.demo 
 * Date:2017年6月13日下午10:08:11 
 * sky.zyl@hotmail.com
 * 
*/

package filterpattern.demo;

/**
 * ClassName:Person <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午10:08:11 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Person {

	private String name;
	private String gender;
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
}
