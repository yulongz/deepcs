/** 
 * Project Name:designpattern 
 * File Name:Employee.java 
 * Package Name:compositepattern.demo 
 * Date:2017年6月13日下午11:19:42 
 * sky.zyl@hotmail.com
 * 
*/

package compositepattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Employee <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月13日 下午11:19:42 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	// 构造函数
	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}
}
