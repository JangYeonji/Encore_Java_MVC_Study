package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Inversion Of Control (IOC) -> 제어의 역행
//Container 서블릿 객체를 생성하여 생명주기 관리
//Container 사용자의 요청방식에 따라 doGet 또는 doPost 호출
//url mapping - /test
/*
 * servlet lifecycle
 * init - (doGet|doPost) - destroy
 * */
@WebServlet("/greeting")
public class TestController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("ctrl init");
	}
	public void destroy() {
		System.out.println("ctrl destroy");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ctrl service");
		
		//response.sendRedirect("test.jsp");
		
		RequestDispatcher view = request.getRequestDispatcher("test.jsp");
		view.forward(request, response);
	}

}
