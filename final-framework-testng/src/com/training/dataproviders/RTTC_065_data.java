package com.training.dataproviders;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.DataProvider;

public class RTTC_065_data {
	
	@DataProvider(name = "db-inputs")
	public static Object [][] getDBData() {
		
		Statement stmt = null;
		String DB_URL = "jdbc:mysql://localhost:3306/test";
		String DB_USER = "root";
		String DB_PASSWORD = "";
		try{
			// Make the database connection
			 String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			// Get connection to DB
			 Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement();
			}
			catch (Exception e)
			{
			 e.printStackTrace();
			}
		String userName = null;
		String password = null;
		String ProductName = null;
		String MetaTagTitle = null;
		String Model = null;
		String Price = null;
		String Quantity = null;
		String Category = null;
		
		try{
			String query = "select * from test";
			// Get the contents of user info table from DB
			ResultSet res = stmt.executeQuery(query);
			// Print the result until all the records are printed
			// res.next() returns true if there is any next record else returns false
			while (res.next())
			{
			userName = res.getString(1);
			password = res.getString(2);
			ProductName = res.getString(3);
			MetaTagTitle = res.getString(4);
			Model = res.getString(5);
			Price = res.getString(6);
			Quantity = res.getString(7);
			Category = res.getString(8);
			}
			}
			catch(Exception e)
			{
			 e.printStackTrace();
			}     
			
		return new Object[][] {
		{userName, password, ProductName, MetaTagTitle, Model, Price, Quantity, Category},
	}; 



		
		

	}
}
