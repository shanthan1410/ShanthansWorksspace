import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * connect url
		 * 
		 * "jdbc:mysql://"+host+":"+port+"/databasename";
		 *  "jdbc:mysql://"+localhost+":"+3306+"/demo";
		 */
		String host="localhost";
		String port="3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "Mynameissandy1410");
		
		Statement s=con.createStatement();
		ResultSet rs =s.executeQuery("select * from credentials WHERE secnario ='zerobalancecard'");
		rs.next();
	    System.out.println(rs.getString("username"));
	    System.out.println(rs.getString("pw"));
	    
		/*
		 * Database testing can be done using testng attributes @dataprovide 
		 * excel sheet and from database using jdbc
		 */
	    
	
	}

}
