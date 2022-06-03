package jdbc;
import java.sql.*;
public class Java2sql {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahiddoc","root","shahid123");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from customers");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
	}
	}
catch(Exception e)
{
	System.out.println(e.toString());
	
}
	}
}
