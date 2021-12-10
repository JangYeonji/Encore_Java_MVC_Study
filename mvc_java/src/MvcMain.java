import java.util.List;

import model.sql.OracleDao;
import model.sql.OracleDaoImpl;
import model.vo.BbsVO;


public class MvcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleDao dao = new OracleDaoImpl();
		
		
//		BbsVO bbs = new BbsVO();
		
		/* INSERT
		System.out.println(">> 게시물 작성");
		bbs.setSubject("휴강안내");
		bbs.setContent("뻥이야");
		bbs.setWriter("jslim");
		bbs.setViewcnt(0);
		
		int insertFlag = dao.insertRow(bbs);
		String result = (insertFlag != 0) ? "insert ok" : "insert error";
		System.out.println(result);
		*/
		
		/* UPDATE
		System.out.println(">> 게시물 수정");
		bbs.setWriter("jyj");
		bbs.setSeq(2);
		int updateFlag = dao.updateRow(bbs);
		String result = (updateFlag != 0) ? "update ok" : "update error";
		System.out.println(result);
		*/
		
		/* DELETE
		System.out.println(">> 게시물 삭제");
		bbs.setSeq(3);
		int deleteFlag = dao.deleteRow(bbs);
		String result = (deleteFlag != 0) ? "delete ok" : "delete error";
		System.out.println(result);
		*/
		
		/* SELECT LIST<>*/
		System.out.println(">> 게시물 리스트");
		List<Object> list = dao.selectRow();
		for(Object obj:list) {
			BbsVO bbs = (BbsVO)obj;
			System.out.println(bbs);
			
		}
		
		System.out.println(">> 게시물 상세정보");
		BbsVO bbs = new BbsVO();
		bbs.setSeq(1);
		Object obj = dao.selectRow(bbs);
		System.out.println((BbsVO)obj);
		
	}

}
