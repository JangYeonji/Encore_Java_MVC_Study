package test.service;

import test.model.dao.TestDAO;

public class TestServiceImpl {
	private TestDAO dao;
	
	public TestServiceImpl() {
		dao = new TestDAO();
	}
	public int insertService() {
		System.out.println("Service >>>> ");
		return dao.insertRow(null);
	}
}
