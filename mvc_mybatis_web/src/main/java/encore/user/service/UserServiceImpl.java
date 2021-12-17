package encore.user.service;

import java.util.List;

import encore.user.model.sql.UserDao;
import encore.user.model.sql.UserDaoImpl;
import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public class UserServiceImpl implements UserService{
	private UserDao dao;
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}
	@Override
	public Object loginService(UserDTO obj) {
		System.out.println(">>>> user service login");
//		return new UserVO();
		return dao.loginRow(obj);
	}
	@Override
	public int registerService(UserVO user) {
		System.out.println(">>>> user service register");
		return dao.registerRow(user);
	}
	@Override
	public List<Object> listService() {
		System.out.println(">>>> service listService");
		return dao.bbsListRow();
	}

}
