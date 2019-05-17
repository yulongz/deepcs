/** 
 * Project Name:designpattern 
 * File Name:Meal.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:33:02 
 * sky.zyl@hotmail.com
 * 
*/

package builderpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Meal <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午4:33:02 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
