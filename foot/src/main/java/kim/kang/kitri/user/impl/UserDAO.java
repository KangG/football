package kim.kang.kitri.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kim.kang.kitri.comm.JDBCUtil;
import kim.kang.kitri.user.UserVO;

@Repository("userDAO")
public class UserDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	// SQL ��ɾ��
	private final String USER_GET = "select * from users where id=? and password=?";

	// CRUD ����� �޼ҵ� ����
	// ȸ�� ���
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			System.out.println("===> JDBC�� getUser() ��� ó��");
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getID());
			stmt.setString(2, vo.getPASSWORD());
			rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UserVO();
				user.setID(rs.getString("id"));;
				user.setPASSWORD(rs.getString("PASSWORD"));
				user.setNAME(rs.getString("NAME"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return user;
	}
	
}