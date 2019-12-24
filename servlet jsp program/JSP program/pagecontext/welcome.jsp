<html>
	<body>
		<%
			String name=request.getParameter("uname");
			out.println("welcome"+name);
			pageContext.setAttribute("user",name,pageContext.SESSION_SCOPE);
		%>
		<a href="second.jsp">Second page</a>
	</body>
</html>