package com.kbstar.frame;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public interface DAO<K1, K2, V> {
	
	public void insert(V v) throws Exception;
	public void delete(K1 k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K1 k) throws Exception;
	public List<V> selectAll() throws Exception;
	public List<V> search(K2 k) throws Exception;
	
	
	//interface에는 추상함수만 들어와야 하나, 이건 모든 daoimpl에 필요하니, dao로 옮김. 
	//그렇게 하려면 default 함수로만 써야 한다
	public default Connection getConnection() throws Exception {
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
		con = DriverManager.getConnection(url, id, pwd);

		return con;
	}
	
}
