package encore.bbs.model.sql;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BbsDaoImpl implements BbsDao{

	private static SqlSessionFactory factory ; 
	SqlSession session ; 
	static {
		System.out.println("------------------- mybatis loading --------------------"); 
		try{
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("resource/config/configuration.xml"));
		}catch(Exception e) {
			e.printStackTrace() ;
		}
	}
	public BbsDaoImpl() {
		session = factory.openSession(true);
		System.out.println(">>>> dao session : " + session);
	}
	@Override
	public List<Object> listRow() {
		System.out.println(">>>> bbs dao bbs list");
		return session.selectList("encore.bbs.listRow");
	}
	@Override
	public int insertRow(Object obj) {
		System.out.println(">>>> bbs dao insertRow");
		return session.insert("encore.bbs.insertRow", obj);
	}
	@Override
	public Object readRow(Object obj) {
		System.out.println(">>>> bbs dao readRow");
		return session.selectOne("encore.bbs.readRow", obj);
	}
	@Override
	public int deleteRow(Object obj) {
		System.out.println(">>>> bbs dao deleteRow");
		return session.delete("encore.bbs.deleteRow", obj);
	}
	@Override
	public void upCntRow(Object obj) {
		System.out.println(">>>> bbs dao upCntRow");
		session.update("encore.bbs.upCntRow", obj);
	}
	@Override
	public int updateRow(Object obj) {
		System.out.println(">>>> bbs dao updateRow");
		return session.update("encore.bbs.updateRow", obj);
	}
	@Override
	public List<Object> searchRow(Object obj) {
		System.out.println(">>>> bbs dao searchRow");
		return session.selectList("encore.bbs.searchRow", obj);
	}

}
