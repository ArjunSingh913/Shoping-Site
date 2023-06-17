import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class LoginFilter implements Filter
{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException
	{
		this.config=config;
		
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String[] cooky = req.getParameterValues("cooky");
		PrintWriter out = res.getWriter();
		ServletContext ctx = config.getServletContext();
		try
		{
			Connection c = (Connection)ctx.getAttribute("con");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from cust where email = '"+email+"' and password = '"+password+"'");
			if(rs.next())
			{
				if(rs.getString("loginStatus").equals("F"))
				{
					s.executeUpdate("update cust set loginStatus='T' where email = '"+email+"' and password = '"+password+"'");
					chain.doFilter(req,res);
					HttpServletResponse  rss  = (HttpServletResponse)res;
					rss.setHeader("Refresh","0;AfterLogin.html");
				}
				else
				{
					out.println("<html><body><h2>User Already Logged In</h2></body></html>");
					HttpServletResponse  rss  = (HttpServletResponse)res;
					rss.setHeader("Refresh","4;AfterLogin.html");	
				}
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("/SignUp.html");
				rd.forward(req,res);
			}
		}
		catch(Exception e)
		{
			out.println(e);
			
		}
		
	}
	public void destroy()
	{}
}