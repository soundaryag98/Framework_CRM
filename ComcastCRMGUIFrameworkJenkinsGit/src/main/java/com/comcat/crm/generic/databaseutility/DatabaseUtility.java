package com.comcat.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.comcat.crm.generic.fileUtility.Path;
import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility implements Path
{
	Connection con;
	Statement state;

	public void getConnection()  {
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			con = DriverManager.getConnection(db_url, db_usn, db_psw);
		} catch (Exception e) {

		}

	}

	public void closeConnection() throws SQLException {
		try {
			con.close();
		} catch (Exception e) {

		}
	}

	public int exceuteNonSelectQuery(String query) throws SQLException
	{int result=0;
		try {
			state = con.createStatement();
		result = state.executeUpdate(query);
		
			
		} catch (Exception e) {
			
		}
		return result;
		
	}

	public ResultSet executeSelectQuery(String query) throws SQLException
	{
		ResultSet result=null;
		try {
			result = state.executeQuery(query);
			
		} catch (Exception e) {
		}
		return result;
		
	}


}
