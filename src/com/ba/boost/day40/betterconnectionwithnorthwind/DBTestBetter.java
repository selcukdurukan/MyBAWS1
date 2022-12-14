package com.ba.boost.day40.betterconnectionwithnorthwind;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestBetter {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.err.println("Wrong number of arguments. Expected is 1, but actual is " + args.length);
			System.exit(100);
		}
		
		DatabaseConnection.getInstance().setPropertiesFile(args[0]);
		
		try {
			Statement stmt = DatabaseConnection.getInstance().getCon().createStatement();
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
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
