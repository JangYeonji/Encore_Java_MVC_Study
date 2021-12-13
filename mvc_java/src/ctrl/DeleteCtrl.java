package ctrl;

import ctrl.util.Controller;
import service.BbsService;
import service.BbsServiceImpl;

public class DeleteCtrl implements Controller{
	private BbsService service;
	public DeleteCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public Object execute(Object obj) {
		System.out.println("delete ctrl execute~~");
		return service.deleteBiz(obj);
	}

}
