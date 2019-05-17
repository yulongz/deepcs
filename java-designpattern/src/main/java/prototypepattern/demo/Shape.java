/** 
 * Project Name:designpattern 
 * File Name:Shape.java 
 * Package Name:prototypepattern.demo 
 * Date:2017年6月11日下午8:31:26 
 * sky.zyl@hotmail.com
 * 
*/

package prototypepattern.demo;

/**
 * ClassName:Shape <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午8:31:26 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
