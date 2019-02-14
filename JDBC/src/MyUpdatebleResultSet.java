import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyUpdatebleResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet rs;
		Connection conn=SqlConnection.createConnection();	
		try {
			Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select accno,bal from bank");
			rs.next();
			rs.next();
			rs.deleteRow();
			System.out.println("record deleted");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}