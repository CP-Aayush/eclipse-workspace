import java.sql.*;
public class JDBCClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/jdbcproject";
			String uname="root";
			String pass="mca6";
			String query="select name from student where id=2";
			
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,uname,pass);
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("name");
		System.out.println(name);
		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
