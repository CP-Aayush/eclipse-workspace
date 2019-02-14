import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//Prepared Statement

public class Oracle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Connection conn=SqlConnection.createConnection();
		
		try {
		int t1=123;
		String t2="lalu";
		Statement s =conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		s.executeUpdate("create table emp66(id int, name varchar(20))");
		s.close();
		
		//creating PreparedStatement
		PreparedStatement ps=conn.prepareStatement("insert into emp66 values (?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ps.setInt(1, t1);
		ps.setString(2, t2);
		ps.executeUpdate();
		ps.close();
		
		
		ps=conn.prepareStatement("select * from emp66 where id=?");
		ps.setInt(1, t1);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
