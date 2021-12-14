package ctrl;

import ctrl.util.Controller;
import ctrl.util.ServiceFactory;
import service.BbsService;
import service.BbsServiceImpl;

public class SearchCtrl implements Controller {
	private BbsService service;
	public SearchCtrl() {
//		service = new BbsServiceImpl();
		ServiceFactory factory = ServiceFactory.getInstance();
		service = factory.getBean("bbs");
	}
	@Override
	public Object execute(Object obj) {
		return service.searchBiz(obj);
	}

}
