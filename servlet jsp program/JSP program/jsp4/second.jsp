<html>
	<body>
		<%
		String name=(String)session.getAttribute("user");
		out.println("Hello Mr. "+name);
		%>
	</body>
</html>