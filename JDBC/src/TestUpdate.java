import java.sql.*;
public class TestUpdate {

	public static void main(String[] args) {		
		Connection conn=SqlConnection.createConnection();
		
		try {
			String z="audi q7";
			String t4="101";
			Statement st =conn.createStatement();
			int z1=st.executeUpdate("update emp101 set xyz='"+z+"'where name ='"+t4+"'");
			System.out.println(z1);
			ResultSet rs=st.executeQuery("select * from emp101");
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}