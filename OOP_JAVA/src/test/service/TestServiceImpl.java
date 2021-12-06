package test.service;

import test.model.dao.TestDAO;
import test.model.vo.TestVO;

public class TestServiceImpl {   //DAO를 필요로 하는 로직
	private TestDAO dao;
	
	public TestServiceImpl() {
		dao = new TestDAO();
	}
	public int insertService(TestVO vo) {
		System.out.println("Service >>>> ");
		return dao.insertRow(vo);
	}
}
