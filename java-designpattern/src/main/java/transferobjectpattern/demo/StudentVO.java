/** 
 * Project Name:designpattern 
 * File Name:StudentVO.java 
 * Package Name:transferobjectpattern.demo 
 * Date:2017年6月19日上午10:22:06 
 * sky.zyl@hotmail.com
 * 
*/

package transferobjectpattern.demo;

/**
 * ClassName:StudentVO <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:22:06 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class StudentVO {
	private String name;
	private int rollNo;

	StudentVO(String name, int rollNo) {
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
