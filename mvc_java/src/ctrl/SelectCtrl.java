package ctrl;

import ctrl.util.Controller;
import ctrl.util.ServiceFactory;
import service.BbsService;
import service.BbsServiceImpl;

public class SelectCtrl implements Controller{

	//dependency injection
	private BbsService service;
	public SelectCtrl() {
//		service = new BbsServiceImpl();
		ServiceFactory factory = ServiceFactory.getInstance();
		service = factory.getBean("bbs");
	}
		
	@Override
	public Object execute(Object obj) {
		System.out.println("select ctrl execute~~");
		return service.selectBiz();
	}
	
}
