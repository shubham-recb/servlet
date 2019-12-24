import javax.servlet.http.*;
import java.io.*;
public class Addition extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)	throws IOException
	{
		PrintWriter p=res.getWriter();
		int num1=req.getParameter("n1");
		int num2=req.getParameter("n2");
		int sum=0;
		int x,y;
		x = integer.parseInt(num1);
		y = integer.parseInt(num2);
		sum=x+y;
		out.println("Addition of two Numbers" +sum);
	}
}