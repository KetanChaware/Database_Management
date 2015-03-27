
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class SignUp extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","iit");
			
			String name=req.getParameter("name");
			String address=req.getParameter("address");
			String contact_no=req.getParameter("contactno");
			int contact = Integer.parseInt(contact_no);
			String email=req.getParameter("email");
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String cpassword=req.getParameter("cpassword");
			
			String q="insert into customers values('"+name+"','"+address+"',"+contact+",'"+email+"','"+username+"','"+password+"')";
			
			PreparedStatement smt=con.prepareStatement(q);
		    smt.executeUpdate();
			con.close();
	}catch(Exception e)
	{out.print(e);}
out.flush();}}