package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class LogoutCtrl implements Controller{

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> ctrl logout execute");
		HttpSession session = request.getSession(false);   //false를 넣으면 기존 세션 가져오는 것
		session.invalidate();
		
		return new View("index.jsp",false);
	}
	
}
