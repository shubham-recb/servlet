<html>
	<body>
		<%
			String name=(String)pageContext.getAttribute("user",pageContext.SESSION_SCOPE);
			out.println("hello"+name);
		%>
	</body>
</html>