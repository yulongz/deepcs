/** 
 * Project Name:designpattern 
 * File Name:CompositeEntity.java 
 * Package Name:compositeentitypattern.demo 
 * Date:2017年6月19日上午9:47:11 
 * sky.zyl@hotmail.com
 * 
*/

package compositeentitypattern.demo;

/**
 * ClassName:CompositeEntity <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午9:47:11 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();

	public void setData(String data1, String data2) {
		cgo.setData(data1, data2);
	}

	public String[] getData() {
		return cgo.getData();
	}
}
