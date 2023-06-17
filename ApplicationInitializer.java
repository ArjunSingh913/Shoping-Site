import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ApplicationInitializer extends HttpServlet
{
	public void init(javax.servlet.ServletConfig sc)throws ServletException
	{
		ServletContext ctx =sc.getServletContext();
		String val = ctx.getInitParameter("oracletab");
		String prop = ctx.getRealPath("WEB-INF//db/db.properties");
		String oracle = ctx.getRealPath("WEB-INF//dbtable/oracletable.txt");
		LoadProperties.propLoad(prop);
		if(val.equals("yes"))
		{
			TableCreate.createTab(oracle);
			System.out.println("Table Created Successfully");
		}
	}
}