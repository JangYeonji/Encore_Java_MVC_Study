package test.mode.dao;

import test.model.vo.TestVO;

public class TestDAO {
	public int insertRow(TestVO vo) {
		System.out.println("dao insertRow~");
		System.out.println(vo.info());
		return 1;
	}
}
