/** 
 * Project Name:designpattern 
 * File Name:MVCPatternDemo.java 
 * Package Name:mvcpattern.demo 
 * Date:2017年6月19日上午9:30:59 
 * sky.zyl@hotmail.com
 * 
*/

package mvcpattern.demo;

/**
 * ClassName:MVCPatternDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:30:59 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class MVCPatternDemo {

	public static void main(String[] args) {

		// 从数据可获取学生记录
		Student model = retriveStudentFromDatabase();

		// 创建一个视图：把学生详细信息输出到控制台
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// 更新模型数据
		controller.setStudentName("John");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
