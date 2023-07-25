

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class servStudent
 */
public class servStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	public void init()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydb";
			con=DriverManager.getConnection(url,"root","Rudra@9765");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address=request.getParameter("address");
		
		PreparedStatement pst=con.prepareStatement("insert into student2 values(?,?,?,?)");
		pst.setInt(1,rollno);
		pst.setString(2, name);
		pst.setInt(3, age);
		pst.setString(4, address);
		
		int k=pst.executeUpdate();
		if(k>0)
		{
			pw.println("Record has been added");
		}
		else
		{
			pw.println("cannot add");
		}
		
	
	}catch(Exception ee)
		{
		ee.printStackTrace();
	}
}
}

	


