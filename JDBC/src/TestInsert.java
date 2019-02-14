import java.sql.*;
//Insert data in a table
public class TestInsert {

	public static void main(String[] args) {
		Connection conn=SqlConnection.createConnection();
		
		try {
		String t1="101";
		String t2="bmw";
		Statement st=conn.createStatement();
		int x=st.executeUpdate("insert into emp101 values('"+t1+"','"+t2+"')");
		System.out.println(x);
		
		ResultSet rs=st.executeQuery("select * from emp101");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}