package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection createConnectionSQLServer() throws Exception {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=CrudJavaMod3;");

		return connection;
	}

	public static void main(String[] args) throws Exception {

		Connection con = createConnectionSQLServer();

		try {
			if (con != null) {
				System.out.println("Conexão obtida com sucesso! " + con);
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}