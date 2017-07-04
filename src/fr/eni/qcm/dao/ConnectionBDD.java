package fr.eni.qcm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe utilitaire qui permet de se connecter a la base
 * @author mvinet
 *
 */
public final class ConnectionBDD {

	public static Connection getConnection() {
		
//		try {
//			InitialContext initialContext = new InitialContext();
//			DataSource dataSource = (DataSource)initialContext.lookup("java:comp/env/jdbc/qcmEni");
//			return dataSource.getConnection();
//		} catch (NamingException e) {
//			System.err.println("Erreur de nom");
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.err.println("Erreur de sql");
//			e.printStackTrace();
//		}
//		
//		return null;
		
		 Connection con = null;;
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String DBurl = "jdbc:sqlserver://10.139.200.20;databasename=Projet;user=sa;password=Pa$$w0rd";
	        con = DriverManager.getConnection(DBurl);
	        
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
        return con;
	}
}