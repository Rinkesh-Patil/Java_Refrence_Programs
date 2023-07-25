package neww;

import java.sql.*;
public class App_1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765="))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
while(rs.next())
{
	int no=rs.getInt("deptno");
	String name=rs.getString("dname");
	String add=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+add);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}	


					

