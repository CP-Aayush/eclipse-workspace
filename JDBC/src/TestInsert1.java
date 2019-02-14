import java.sql.*;
//create table via jdbc
public class TestInsert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=SqlConnection.createConnection();
		
		try {
		String t1="audi q7";
		int t2=1001;
		Statement s=conn.createStatement();
		s.executeUpdate("create table emp55(name varchar(10),id numeric(10))");
		int x=s.executeUpdate("insert into emp55 values ('"+t1+"'+'"+t2+")");
		System.out.println(x);
		
		ResultSet rs=s.executeQuery("select * from emp55");
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}