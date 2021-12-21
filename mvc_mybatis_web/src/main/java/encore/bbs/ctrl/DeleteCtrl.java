package encore.bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.bbs.model.vo.BbsVO;
import encore.bbs.service.BbsService;
import encore.bbs.service.BbsServiceImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class DeleteCtrl implements Controller{
	private BbsService service;
	public DeleteCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> bbs ctrl delete");

		BbsVO bbs = new BbsVO();
		int seq = Integer.parseInt(request.getParameter("seq"));
		bbs.setSeq(seq);
		System.out.println(seq);
		
		int flag = service.deleteService(bbs);
		if(flag!=0) {
			return new View("list.encore",true);
		}else {
			return new View("read.encore",false);
		}
		
	}

}
