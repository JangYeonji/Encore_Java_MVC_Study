package encore.bbs.service;

import java.util.List;

import encore.bbs.model.vo.BbsVO;

public interface BbsService {
	public List<Object> listService();
	public int postService(Object obj);
	public Object readService(Object obj);
	public int deleteService(Object obj);
	public void upCntService(Object obj);
}
