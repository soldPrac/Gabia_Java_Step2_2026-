package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete_04 {
	public static void main(String[] args) {
		Connection con = null;

		try {
			// 1.JDBC 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. Connection 읽기
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 연결코드
			String user = "member"; // 사용자=데이터베이스
			String password = "12345"; // 비번

			con = DriverManager.getConnection(url, user, password);

			// 3. usertbl 입력
			String sql = "delete from usertbl where userid=?";

			// 4. PreparedStatement로 String -> sql
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "spring");

			// 5. 실행
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 회원 수: " + rows);

			pstmt.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} // if
		} // finally
	}
}
