package encore.user.service;

import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public class UserServiceImpl implements UserService{

	@Override
	public UserVO loginService(UserDTO obj) {
		System.out.println("user service login");
		return new UserVO();
	}

}
