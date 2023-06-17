import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try
		{
			HttpSession session = req.getSession();
			session.setAttribute("email",email);
			session.setAttribute("password",password);			
		}
		catch(Exception e){out.println(e);System.out.println(e);}
	}
}