/** 
 * Project Name:designpattern 
 * File Name:Dispatcher.java 
 * Package Name:frontcontrollerpattern.demo 
 * Date:2017年6月19日上午10:00:54 
 * sky.zyl@hotmail.com
 * 
*/

package frontcontrollerpattern.demo;

/**
 * ClassName:Dispatcher <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年6月19日 上午10:00:54 <br/>
 * 
 * @author "Yulong Zhang"
 * @version
 * @since JDK 1.7
 * @see
 */
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
