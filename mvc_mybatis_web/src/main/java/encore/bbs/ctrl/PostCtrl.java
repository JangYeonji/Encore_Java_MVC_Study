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
		if(flag!=0) {
			view.setPath("list.encore");   //bbb_index.jsp로 바로 보내면 데이터를 들고 갈 수가 없음
			view.setSend(false);   //redirect 시켜서 url을 바꾸는 것
		}else {
			view.setPath("postForm.encore");
			view.setSend(false);
		}
		return view;
		
		
		
		
		
		
		
		
		
		
	}
	
}
