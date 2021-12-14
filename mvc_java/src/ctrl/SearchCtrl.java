package ctrl;

import ctrl.util.Controller;
import service.BbsService;
import service.BbsServiceImpl;

public class SearchCtrl implements Controller {
	private BbsService service;
	public SearchCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public Object execute(Object obj) {
		return service.searchBiz(obj);
	}

}
