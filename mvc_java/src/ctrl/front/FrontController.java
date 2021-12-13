package ctrl.front;

import ctrl.util.BeanFactory;
import ctrl.util.Controller;

public class FrontController {
	private BeanFactory factory;
	
	public FrontController() {
		factory = BeanFactory.getInstance();
	}
	public void requestProc(int code, Object obj) {
		Controller ctrl = factory.getBean(code);
		ctrl.execute(obj);
	}
}
