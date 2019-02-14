import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SqlConnection {
	static Connection conn;

	public static Connection createConnection()
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcproject?autoReconnect=true&useSSL=false";
		conn=DriverManager.getConnection(url, "root", "mca6");
		JOptionPane.showMessageDialog(null, "Connection successfull");
		return conn;
		
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}

	}
}