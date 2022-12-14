package com.ba.boost.day40.betterconnectionwithboost04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestBetter {
	private Connection connection;
	
	public DBTestBetter () {
		this.connection = DatabaseConnection.getInstance().getCon();
	}
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Wrong number of arguments. Expected <<<1>>> actual <<<" + args.length + ">>>");
			System.exit(100);
		}

		DatabaseConnection.getInstance().setPropertiesFile(args[0]);
		
		DBTestBetter dbTest = new DBTestBetter();
		
		dbTest.dbSimpleSelect();
		if (dbTest.createTable()) 
			dbTest.insertStudents();
	}
	
	private void insertStudents() {
		// TODO Auto-generated method stub
		
	}
	private void dbSimpleSelect() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs    = stmt.executeQuery("SELECT oid, class_name, gpa FROM class101");
			
			while (rs.next()) {
				System.out.println(rs.getLong("oid") + " - " + rs.getString(2) + " - " + rs.getDouble("gpa"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private boolean createTable() {
		boolean retVal = false;
		String create = "CREATE TABLE IF NOT EXISTS public.students" + 
				   "(" +
					    "oid bigserial NOT NULL, " +
					    "name character varying NOT NULL, " +
					    "last_name character varying NOT NULL, " +
					    "middle_name character varying, " +
					    "registration_number integer NOT NULL, " +
					    "CONSTRAINT primary_key PRIMARY KEY (oid), " +
					    "CONSTRAINT \"unique_registration_number\" UNIQUE (registration_number)" +
					");" +

					"ALTER TABLE public.students OWNER to postgres;";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			retVal = stmt.execute(create);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retVal;
	}
}

