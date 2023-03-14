package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	// construct는 Driver Loading
	public CustDaoImpl() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");

	}

	// getConnection 이라는 함수를 만들어서 쓰기로...
	// insert delete 등 등 할 때마다 이거 바로 쓰려고..
	public Connection getConnection() throws Exception {
		Connection con = null;

		// java 소스에 id pwd 넣어놓는건, 보안상, 변경되었을 때 번거로우니
		// txt 파일에 넣어두구 실행할 때마다 읽어서 실행
		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		// db_info.txt 라는 파일에다가 얘네들을 넣어놓을거라는 뜻
		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");

		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {

			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// 필요하면 e1.printStackTrace();로 찍어보고 아니면 던지기throw
			// 여기서 발생을 하면 insert 돌리면 program에서는 예외가 발생하는지 모르니, throw 하기
			throw e1;
			// e1.printStackTrace();

		}

	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deletesql);) {
			pstmt.setString(1, k);

			// 해당 사항이 없으면, 예외로 안나오고 result가 0으로 나옴
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
			System.out.println(result);
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updatesql);) {

			// pwd=?, name=?, age=? WHERE id=?"
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();

			if (result == 0) {
				throw new Exception();
			}

		} catch (Exception e1) {
			throw e1;
		}

	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectsql);) {
			pstmt.setString(1, k);
			
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(db_id, db_pwd, name, age);
				 
			}catch(Exception e) {
				throw e;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return cust;
	}
	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllsql)) {
			try(ResultSet rset=pstmt.executeQuery();){
				while(rset.next()) {
					Cust cust = null;
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(db_id, db_pwd, name, age);
					list.add(cust);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
			
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
