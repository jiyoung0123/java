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
	
	// Cart DMl
	public static String cartdeleteSql = "DELETE FROM cart WHERE id =?";
	public static String cartinsertSql = "INSERT INTO cart VALUES(?,?,?,?,SYSDATE)";
	public static String cartupdateSql = "UPDATE cart SET user_id=? item_id=?, cnt=? WHERE id=?";
	public static String cartselectSql = "SELECT * FROM cart WHERE id=?";
	public static String cartselectAllSql = "SELECT * FROM cart";

}
