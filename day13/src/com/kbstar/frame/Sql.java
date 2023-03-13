package com.kbstar.frame;

public class Sql {
	public static String deletesql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updatesql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String selectsql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllsql = "SELECT * FROM cust";

}
