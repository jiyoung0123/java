package com.kbstar.frame;

public class Sql {
	//Cust DML
	public static String deletesql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updatesql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String selectsql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllsql = "SELECT * FROM cust";
	
	// Item DML
	public static String itemdeleteSql = "DELETE FROM item WHERE id =?";
	public static String iteminsertSql = "INSERT INTO item VALUES(?,?,?,?,SYSDATE)";
	public static String itemupdateSql = "UPDATE item SET name=?, price=?, rate=? WHERE id=?";
	public static String itemselectSql = "SELECT * FROM item WHERE id=?";
	public static String itemselectAllSql = "SELECT * FROM item";
	
	

}
