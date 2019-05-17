/** 
 * Project Name:designpattern 
 * File Name:Student.java 
 * Package Name:dataaccessobjectpattern.demo 
 * Date:2017年6月19日上午9:51:12 
 * sky.zyl@hotmail.com
 * 
*/

package dataaccessobjectpattern.demo;

/**
 * ClassName:Student <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:51:12 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Student {
	private String name;
	private int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
