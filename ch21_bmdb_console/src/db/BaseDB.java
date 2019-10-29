package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDB {
	
	protected Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;

	}
}
