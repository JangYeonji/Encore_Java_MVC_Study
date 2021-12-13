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
	public Object execute(Object obj) {
		System.out.println("write ctrl execute");
		
//		BbsVO bbs = new BbsVO();   			//View에서 실행
//		bbs.setSubject("맛점하세요");
//		bbs.setContent("오늘은 짜장면으로");
//		bbs.setWriter("admin");
//		bbs.setViewcnt(0);
//		int flag = service.insertBiz(bbs);
		
//		int flag = service.insertBiz(obj);
//		System.out.println("insert flag >> " + flag);
		
		return service.insertBiz(obj);
	}
	
}
