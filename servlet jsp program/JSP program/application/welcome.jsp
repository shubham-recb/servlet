<% 
	out.println("welcome"+request.getParameter("uname"));
	String driver=application.getInitParameter("dname");
	out.println("driver name is"+driver);
%>