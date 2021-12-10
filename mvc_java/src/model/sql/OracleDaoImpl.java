package model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.BbsVO;
import model.vo.UserVO;

public class OracleDaoImpl implements OracleDao {
	
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver" ; 
	public static final String URL    = "jdbc:oracle:thin:@127.0.0.1:1521:xe" ;		
	public static final String USER   = "hr" ;
	public static final String PASSWD = "hr" ;
	
	public OracleDaoImpl() {
		try {
			Class.forName(DRIVER) ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
//	SEQ NUMBER PRIMARY KEY,
//	SUBJECT VARCHAR2(50),
//	CONTENT VARCHAR2(1000),
//	WRITTER VARCHAR2(50),
//	REGDATE DATE,
//	VIEWCNT NUMBER
	
	@Override
	public int insertRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String insertSQL = "INSERT INTO BBS_TBL VALUES(BBS_SEQ.NEXTVAL,?,?,?,SYSDATE,?)" ;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(insertSQL) ; 
			
			pstmt.setString(1, ((BbsVO)obj).getSubject());   //부모는 자식에 접근 못하니까 다운캐스팅 함
			pstmt.setString(2, ((BbsVO)obj).getContent());
			pstmt.setString(3, ((BbsVO)obj).getWriter());
			pstmt.setInt(4, ((BbsVO)obj).getViewcnt());
			
			flag = pstmt.executeUpdate() ; 
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public int updateRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String updateSQL = "UPDATE BBS_TBL SET WRITTER=? WHERE SEQ=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(updateSQL);
			
			pstmt.setString(1, ((BbsVO)obj).getWriter());
			pstmt.setInt(2, ((BbsVO)obj).getSeq());
			flag = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public int deleteRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String deleteSQL = "DELETE FROM BBS_TBL WHERE SEQ=?";
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(deleteSQL);
			
			pstmt.setInt(1, ((BbsVO)obj).getSeq());
			flag = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public List<Object> selectRow() {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		List<Object> list       = new ArrayList() ;  
		String selectSQL = "SELECT * FROM BBS_TBL";
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			pstmt = conn.prepareStatement(selectSQL) ; 
			rset = pstmt.executeQuery() ; 
			while(rset.next()) {
				list.add(new BbsVO(
						rset.getInt(1),
						rset.getInt(6),
						rset.getString(2),
						rset.getString(3),
						rset.getString(4),
						rset.getString(5)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public Object selectRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		Object            row   = null ;  
		String selectSQL = "SELECT * FROM BBS_TBL WHERE SEQ = ?" ; 
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWD);			
			pstmt = conn.prepareStatement(selectSQL) ; 
			
			pstmt.setInt(1, ((BbsVO)obj).getSeq()); 
			rset = pstmt.executeQuery() ; 
			
			while(rset.next()) {
				row = new BbsVO(
						rset.getInt(1),
						rset.getInt(6),
						rset.getString(2), 
						rset.getString(3),
						rset.getString(4),
						rset.getString(5));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return row;
	}


}
