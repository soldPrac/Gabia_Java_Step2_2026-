package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 등록
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 데이터 베이스 연결 메서드
	public Connection getConnection() {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 연결코드
			String user = "member"; // 사용자=데이터베이스
			String password = "12345"; // 비번

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}//
	
	// PreparedStatement에 대한 자원 반납
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
	}//
	
	// Connection 자원 반납
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {

		try {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
	}//
	
	// select
	public UserDTO select(String userid) {
		UserDTO userDto = null;
		try {

			con = getConnection();

			String sql = "SELECT userid, name, password, age, email FROM  usertbl WHERE userid=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				userDto = new UserDTO();
				userDto.setUserid(rs.getString("userid"));
				userDto.setName(rs.getString("name"));
				userDto.setPassword(rs.getString("password"));
				userDto.setAge(rs.getInt("age"));
				userDto.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 SQL 실행 중 오류 발생");
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return userDto;
	}//

	// 아이디와 비번이 일치하는 경우 삭제
	public int delete(String userid, String password) {

		int rows = 0;
		try {

			con = getConnection();

			String sql = "DELETE FROM userTBL WHERE userid = ? and password = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);

			rows = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return rows;
	}//

	// 사용자 이메일 수정
	public int update(UserDTO updateDto) {

		int rows = 0;
		try {

			con = getConnection();

			String sql = "UPDATE usertbl SET email = ? WHERE userid = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateDto.getEmail());
			pstmt.setString(2, updateDto.getUserid());

			rows = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return rows;
	}//

	// 입력
	public int insert(UserDTO updateDto) {

		int rows = 0;
		try {

			con = getConnection();

			String sql = "INSERT INTO usertbl(userid, name, password, age, email) ";
			sql += "VALUES (?,?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateDto.getUserid());
			pstmt.setString(2, updateDto.getName());
			pstmt.setString(3, updateDto.getPassword());
			pstmt.setInt(4, updateDto.getAge());
			pstmt.setString(5, updateDto.getEmail());

			rows = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return rows;
	}//
}
