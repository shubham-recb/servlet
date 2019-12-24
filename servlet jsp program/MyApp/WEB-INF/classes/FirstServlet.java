import javax.servlet.*;
import java.io.*;

public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	throws IOException
	{
		PrintWriter p= res.getWriter();
		p.println("Hi Shubham How Are You");
	}
}