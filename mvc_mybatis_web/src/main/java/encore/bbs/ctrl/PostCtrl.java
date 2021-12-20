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
import encore.user.model.vo.UserVO;

public class PostCtrl implements Controller{
	public BbsService service;
	public PostCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> post ctrl execute");
		request.setCharacterEncoding("UTF-8");
		
		String writer = request.getParameter("writer");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		BbsVO bbs = new BbsVO();
		bbs.setContent(content);
		bbs.setSubject(subject);
		bbs.setWriter(writer);
		
		int flag = service.postService(bbs);
		View view = new View();
		if(flag==1) {
			view.setPath("bbs_index.jsp");
			view.setSend(true);
		}else {
			view.setPath("post.jsp");
			view.setSend(false);
		}
		return view;
		
		
		
		
		
		
		
		
		
		
	}
	
}
