package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateTest {
	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.59:1521:XE";
		String updatesql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
		
		// Statement 생성 - SQL
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(updatesql);){
			pstmt.setString(1, "pwd04");
			pstmt.setString(2, "낑깡");
			pstmt.setInt(3, 40);
			pstmt.setString(4, "id04");								
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		}
		
		// SQL 전송
		
		// 결과 받기
		
		// Close
		
	}