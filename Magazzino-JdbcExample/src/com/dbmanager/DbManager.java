package com.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.Constants;

public class DbManager implements Constants{
	private static Connection conn;
	

	public static Connection getConnection()
			throws ClassNotFoundException, SQLException {
		Class.forName(Driver);
		conn = DriverManager.getConnection(URL,username,password);
		conn.setAutoCommit(false);

		return conn;
	}
	
	

	public static void closeConnection() throws SQLException {
		if (conn != null)
			conn.close();
	}
	
	

}
