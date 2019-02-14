import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=SqlConnection.createConnection();
		
		try {
			Statement st=conn.createStatement();
			int fetchSize=st.getFetchSize();
			System.out.println(fetchSize);
			
			st.setFetchSize(100);
			fetchSize=st.getFetchSize();
			System.out.println(fetchSize);
			
			ResultSet rs=st.executeQuery("select * from bank");
			fetchSize=rs.getFetchSize();
			System.out.println(fetchSize+" via resultset before");
			
			rs.setFetchSize(200);
			fetchSize=rs.getFetchSize();
			System.out.println(fetchSize+" via resultset after changing in statement");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
