package encore.bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.bbs.service.BbsService;
import encore.bbs.service.BbsServiceImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class UpdateCtrl implements Controller{
	private BbsService service;
	public UpdateCtrl() {
		service = new BbsServiceImpl();
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return null;
	}

}
