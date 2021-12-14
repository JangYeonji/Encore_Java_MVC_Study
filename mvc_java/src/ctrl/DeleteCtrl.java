package ctrl;

import ctrl.util.Controller;
import ctrl.util.ServiceFactory;
import service.BbsService;
import service.BbsServiceImpl;

public class DeleteCtrl implements Controller{
	private BbsService service;
	public DeleteCtrl() {
//		service = new BbsServiceImpl();
		ServiceFactory factory = ServiceFactory.getInstance();
		service = factory.getBean("bbs");
	}
	@Override
	public Object execute(Object obj) {
		System.out.println("delete ctrl execute~~");
		return service.deleteBiz(obj);
	}

}
