/** 
 * Project Name:designpattern 
 * File Name:StudentDao.java 
 * Package Name:dataaccessobjectpattern.demo 
 * Date:2017年6月19日上午9:51:41 
 * sky.zyl@hotmail.com
 * 
*/

package dataaccessobjectpattern.demo;

import java.util.List;

/**
 * ClassName:StudentDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:51:41 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public interface StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
