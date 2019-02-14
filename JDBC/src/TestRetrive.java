import java.sql.*;
//display table data
public class TestRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=SqlConnection.createConnection();
		
		try {
			Statement st=conn.createStatement();
			ResultSet result=st.executeQuery("select * from emp101");
			
			while (result.next()) {
				System.out.println(result.getString("name")+"="+result.getString(2));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}