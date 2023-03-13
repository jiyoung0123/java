package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertTest3 {
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
		String insertsql = "INSERT INTO cust VALUES(?,?,?,?)";
		
		// Statement 생성 - SQL
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(insertsql);){
			pstmt.setString(1, "id06");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "김낑깡");
			pstmt.setInt(4, 50);
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
