package ctrl;

import ctrl.util.Controller;
import model.vo.BbsVO;
import service.BbsService;
import service.BbsServiceImpl;

public class WriteCtrl implements Controller{
	//dependency injection
	private BbsService service;
	public WriteCtrl() {
		service = new BbsServiceImpl();
	}

	@Override
	public void execute() {
		System.out.println("write ctrl execute");
		BbsVO bbs = new BbsVO();
		bbs.setSubject("맛점하세요");
		bbs.setContent("오늘은 짜장면으로");
		bbs.setWriter("admin");
		bbs.setViewcnt(0);
		int flag = service.insertBiz(bbs);
		System.out.println("insert flag >> " + flag);
	}
	
}