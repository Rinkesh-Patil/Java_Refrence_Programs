

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

/**
 * Servlet implementation class myserv
 */
public class myserv extends HttpServlet {
	private Connection con;
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public myserv() {
        // TODO Auto-generated constructor stub
    	
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter out=response.getWriter();
	out.println("With Connection Pool");
	con=ds.getConnection();
	PreparedStatement pst=con.prepareStatement("select * from dept");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		out.println(rs.getInt(1)+"\t");
		out.println(rs.getString(2)+"\t");		
		out.println(rs.getString(3));
	}
		con.close();
		}
		catch(Exception ex)
		{
			System.out.println("In Service\t"+ex);
		}
		

	}

}
