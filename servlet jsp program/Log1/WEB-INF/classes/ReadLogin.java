import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ReadLogin extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		PrintWriter p= res.getWriter();
		String s=req.getParameter("n1");
		p.println("welcome"+s);
	}
}