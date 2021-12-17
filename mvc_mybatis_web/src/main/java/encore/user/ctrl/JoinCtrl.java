package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class JoinCtrl implements Controller{

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>> join ctrl execute");
		return new View("join.jsp",true);
	}

}
