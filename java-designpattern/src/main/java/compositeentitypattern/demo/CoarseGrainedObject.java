/** 
 * Project Name:designpattern 
 * File Name:CoarseGrainedObject.java 
 * Package Name:compositeentitypattern.demo 
 * Date:2017年6月19日上午9:46:55 
 * sky.zyl@hotmail.com
 * 
*/

package compositeentitypattern.demo;

/**
 * ClassName:CoarseGrainedObject <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:46:55 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CoarseGrainedObject {
	DependentObject1 do1 = new DependentObject1();
	DependentObject2 do2 = new DependentObject2();

	public void setData(String data1, String data2) {
		do1.setData(data1);
		do2.setData(data2);
	}

	public String[] getData() {
		return new String[] { do1.getData(), do2.getData() };
	}
}
