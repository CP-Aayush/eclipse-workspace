import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=SqlConnection.createConnection();
		try {
			
			String t5="101";
			Statement s=conn.createStatement();
			int a =s.executeUpdate("delete from emp101 where name='"+t5+"'");
			System.out.println(a);
			
			ResultSet rs=s.executeQuery("select * from emp101");
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

}