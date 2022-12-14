package com.ba.boost.day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/northwind";
		
		/*
		 * 2. yöntem ile bağlanma
		 */
//		String url = "jdbc:postgresql://localhost:5432/northwind?user=postgres&password=root"; 
		
		try {
			Connection con = DriverManager.getConnection(url, "postgres", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT customer_id, company_name, city FROM customers;");
			while (rs.next()) {
				System.out.println(rs.getString("customer_id"));
				System.out.println(rs.getString("company_name"));
				System.out.println(rs.getString("city"));
				
				/*
				 * veya
				 */
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
			}
			
			/*
			 * 2. yöntem ile bağlanma
			 */
//			Connection con = DriverManager.getConnection(url);
			
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
