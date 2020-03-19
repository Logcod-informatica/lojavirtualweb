package org.loja.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConfigDataSource {

	private static Connection connection;

	public static Connection getConnection() {
		try {
			
			Properties ps = new Properties();
			ps.setProperty("user", "wkxhxyxqxevwpp");
			ps.setProperty("password", "a3b29d37ab1743a6e22cdc239134bd792fbc8285ebc5bef8601e4a182a8d21b8");
			ps.setProperty("ssl", "true");
			ps.setProperty("sslmode", "verify-ca");
			ps.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
		//	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager
					   //.getConnection("jdbc:mysql://localhost:3306/fabrica", "logcod", "1@cuca82");
					   .getConnection("jdbc:postgresql://ec2-54-243-208-234.compute-1.amazonaws.com:5432/dbvfup6ivhpd2l", ps);
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
