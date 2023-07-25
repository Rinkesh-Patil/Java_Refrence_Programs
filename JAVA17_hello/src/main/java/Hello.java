
//import java.sql.*;
//public class Hello 
//{
//	public static void main(String args[])
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//System.out.println("Implementation class is\t"+con.getClass()); 
//Statement st=con.createStatement();
//ResultSet rs=st.executeQuery("select * from dept");
//System.out.println("DeptNo"+"\t"+"DeptName"+"   "+"Loc");
//while(rs.next())
//{
//	int no=rs.getInt("deptno");
//	String name=rs.getString("dname");
//	String add=rs.getString("loc");
//	System.out.println(no+"\t"+name+"\t   "+add);
//}
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}	
//import java.sql.*;
//public class Hello
//{
//	public static void main(String args[])
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//System.out.println("Implementation class is\t"+con.getClass()); 
//Statement st=con.createStatement();
//ResultSet rs=st.executeQuery("select * from dept");
//ResultSetMetaData rms=rs.getMetaData();
//int col=rms.getColumnCount();
//System.out.println("Details of Dept by explicitly registering");
//	for(int i=1;i<=col;i++)
//	{
//		System.out.print(rms.getColumnName(i)+"\t");
//	}
//while(rs.next())
//{
//System.out.print("\n");
//	for(int i=1;i<=col;i++)
//	{
//		System.out.print(rs.getObject(rms.getColumnName(i))+"\t");
//	System.out.print(rs.getObject(i)+"\t");
//
//	}
//
//}
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}	
//import java.sql.*;
//public class Hello
//{
//	public static void main(String args[])
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//System.out.println("Implementation class is\t"+con.getClass());
//Statement st=con.createStatement();
//int val=st.executeUpdate("update dept set loc='bombay'");
//if(val>0)
//{
//	System.out.println("Records updated");
//}
//else
//{
//	System.out.println("can not update records");
//}	
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}
//import java.sql.*;
//public class Hello
//{
//	public static void main(String args[])
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//System.out.println("Implementation class is\t"+con.getClass());
//PreparedStatement pst=con.prepareStatement("update dept set loc=?");
//pst.setString(1,"delhi");
//	//replace 1'st question mark with "delhi"
//int mod=pst.executeUpdate();
//
//if(mod>0)
//{
//	System.out.println("Records are successfully added");
//}
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}
//import java.sql.*;
//public class Hello 
//{
//	public static void main(String args[])
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//
//ResultSet rs=st.executeQuery("select deptno,dname,loc from dept");
//
//rs.absolute(4);
//rs.updateString("loc","USA");
//rs.updateRow();
//rs.previous();
//rs.updateString("dname","edp");
//rs.updateRow();
//rs.absolute(3);
//rs.updateString("loc","england");
//rs.updateRow();
//
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}						
//import java.sql.*;
//public class Hello
//{
//	public static void main(String args[])throws Exception
//	{
//		String ss="jdbc:mysql://localhost:3306/mydb";
//		try(Connection con=DriverManager.getConnection(ss,"root","Rudra@9765"))
//		{
//			try
//			{
//con.setAutoCommit(false);
//Statement st=con.createStatement();
//int a=st.executeUpdate("update dept set loc='Dhule'");
//int b=st.executeUpdate("insert into dept values(11,'Rudra','Dhule')");
//con.commit();
//}
//catch(Exception ee)
//{
//	con.rollback();		
//	System.out.println(ee);
//}
//		con.setAutoCommit(true);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//}
//}
//import java.sql.*;
//public class Hello 
//{
//	public static void main(String args[])
//	{
//		try
//		{
////Class.forName("com.mysql.cj.jdbc.Driver");
//String ss="jdbc:mysql://localhost:3306/mydb";
//Connection con=DriverManager.getConnection(ss,"root","Rudra@9765");
//Statement st=con.createStatement();
//boolean b=st.execute("select * from dept");
////boolean b=st.execute("update dept set loc='Manali'");
//if(b)
//{
//	ResultSet rs=st.getResultSet();
//while(rs.next())
//{
//	int no=rs.getInt("deptno");
//	String name=rs.getString("dname");
//	String add=rs.getString("loc");
//	System.out.println(no+"\t"+name+"\t"+add);
//}
//}
//else
//{
//	int mod=st.getUpdateCount();
//	System.out.println("mod is\t"+mod);
//	if(mod>0)
//	{
//		System.out.println("Records are successfully added");
//	}
//}
//con.close();
//}
//catch(Exception ee)
//{
//	System.out.println(ee);
//}
//}
//}
//import javax.sql.rowset.CachedRowSet;
//import javax.sql.rowset.RowSetProvider;
//public class Hello //CachedRowSetDemo
//{
//	public static void main(String args[])
//	{
//		try(CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();)
//		{
//			crs.setUsername("root");
//			crs.setPassword("Rudra@9765");
//			crs.setUrl("jdbc:mysql://localhost:3306/mydb");
//			crs.setCommand("select * from dept");
//			crs.execute();
//			System.out.println("Even after connection closed with ARM");
//			while(crs.next())
//			{
//				int a=crs.getInt(1);
//				String b=crs.getString(2);
//				String c=crs.getString(3);
//				System.out.println(a+"\t"+b+"\t"+c);
//			}
//
//		}
//		catch(Exception ee)
//		{
//			ee.printStackTrace();
//		}
//	}
//}
// import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.ResourceBundle;
//
//public class Hello //ConnectionProvider
//{
//	static Connection con;
//	public static Connection getCon()
//	{
//		try
//		{
//			String url,user,password;
//			ResourceBundle rb=ResourceBundle.getBundle("myproperty");
//			url=rb.getString("url");
//			user=rb.getString("user");
//			password=rb.getString("password");
//		 con=DriverManager.getConnection(url,user,password);
//		}
//		catch(Exception ee)
//		{
//			System.out.println(ee);
//		}
//		return con;
//	}
//	
//}










//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//public class Hello {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) 
//	{
//		try(Connection con=ConnectionProvider.getCon())
//		{
//			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery("select * from dept");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//	
//			}
//		}
//		catch(Exception ee)
//		{
//			System.out.println(ee);
//		}
//
//	}
//
//}

















						








						

					
