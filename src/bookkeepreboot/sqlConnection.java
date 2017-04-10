
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
public class sqlConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
	Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=stock1;user=root;password=dbpass");
	System.out.println("test");
	Statement sta = conn.createStatement();
	String Sql = "select userN, password from login";
	ResultSet rs = sta.executeQuery(Sql);
	while (rs.next()) {
        	System.out.println(rs.next());
		}
	}

}
