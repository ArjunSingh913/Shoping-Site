import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RegisterFilter implements Filter
{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException
	{
		this.config=config;
		
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
	{
		PrintWriter out = res.getWriter();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
			ServletContext ctx = config.getServletContext();
			try
			{
				Connection c = (Connection)ctx.getAttribute("con");
				Statement s = c.createStatement();
				ResultSet rs = s.executeQuery("select * from cust where email = '"+email+"' and password = '"+password+"'");
				if(rs.next())
				{
					chain.doFilter(req,res);
				}
				else
				{
					int x = s.executeUpdate("insert into cust values('"+email+"','"+password+"','F')");
					
					HttpServletResponse  rss  = (HttpServletResponse)res;
					rss.setHeader("Refresh","0;Login.html");
					//RequestDispatcher rd = req.getRequestDispatcher("/registered");
					//rd.forward(req,res);
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