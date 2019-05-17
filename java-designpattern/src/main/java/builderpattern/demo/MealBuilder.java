/** 
 * Project Name:designpattern 
 * File Name:MealBuilder.java 
 * Package Name:builderpattern.demo 
 * Date:2017年6月11日下午4:33:48 
 * sky.zyl@hotmail.com
 * 
*/

package builderpattern.demo;

/**
 * ClassName:MealBuilder <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月11日 下午4:33:48 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
