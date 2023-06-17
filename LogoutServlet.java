import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class LogoutServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		
HttpSession session = req.getSession(false);
Cookie[] cookies = req.getCookies();
  if (cookies != null)
  for (int i = 0; i < cookies.length; i++)
{
cookies[i].setValue("");
					cookies[i].setPath("/");
					cookies[i].setMaxAge(0);
					res.addCookie(cookies[i]);
}
				if(session!=null)
				session.invalidate();
				RequestDispatcher rd = req.getRequestDispatcher("/index.html");
				rd.forward(req,res);
				out.println("</html></body>");
	}
			
		
		
}
