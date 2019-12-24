<html>
	<body>
		<%
		String name=request.getParameter("n");
		out.println("Welcome Friends Mr. "+name);
		session.setAttribute("user",name);
		%>
		<a href="second.jsp">second jsp page</a>
	</body>
</html>