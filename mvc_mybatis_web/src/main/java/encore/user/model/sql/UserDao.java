package encore.user.model.sql;

import encore.user.model.vo.UserVO;

public interface UserDao {
	public Object loginRow(Object obj);

	public int registerRow(UserVO user);
}
