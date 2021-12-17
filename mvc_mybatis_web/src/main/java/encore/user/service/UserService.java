package encore.user.service;

import java.util.List;

import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public interface UserService {
	public Object loginService(UserDTO user);
	public int registerService(UserVO user);
	public List<Object> listService();
}
