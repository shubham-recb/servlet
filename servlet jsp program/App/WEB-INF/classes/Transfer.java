import javax.servlet.http.*;
import java.io.*;
public class Transfer extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)	throws IOException
	{
		PrintWriter p=res.getWriter();
		String s1=req.getParameter("u1");
		String s2=req.getParameter("p1");
		if(s1.equals("ravi")&&s2.equals("simple"))
		{
			p.println("<b>Valid Your Email</b>");
		}
		else
		{
			p.println("<b>Invalid Your Email</b>");
		}
	}
}