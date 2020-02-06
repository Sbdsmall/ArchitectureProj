package com.architecture.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection connect() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:postgresql://bidoof-database.cnoofslsxyro."
				+ "us-east-2.rds.amazonaws.com:5432/postgres"
				+ "?currentSchema=architect",
				 "Stefan0327","Brooklyn99!");
	}
}
