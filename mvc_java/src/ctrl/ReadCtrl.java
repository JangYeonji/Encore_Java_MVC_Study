package ctrl;

import ctrl.util.Controller;
import ctrl.util.ServiceFactory;
import service.BbsService;
import service.BbsServiceImpl;

public class ReadCtrl implements Controller{

	//dependency injection
	private BbsService service;
	public ReadCtrl() {
//		service = new BbsServiceImpl();
		ServiceFactory factory = ServiceFactory.getInstance();
		service = factory.getBean("bbs");
	}
		
	@Override
	public Object execute(Object obj) {
		System.out.println("read ctrl execute~~");
		return service.selectBiz(obj);
	}

}
