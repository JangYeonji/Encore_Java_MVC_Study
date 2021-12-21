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

public class UpdateCtrl implements Controller {
	private BbsService service;
	public UpdateCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BbsVO bbs = new BbsVO();
		bbs.setContent(content);
		bbs.setSeq(seq);
		bbs.setSubject(subject);
		
		int flag = service.updateService(bbs);
		if(flag!=0) {
			return new View("read.encore?seq="+seq,true);
		}else {
			return new View("updateForm.encore",true);
		}
		
		
	}

}
