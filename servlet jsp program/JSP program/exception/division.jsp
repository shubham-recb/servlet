<%@ page errorPage="exception.jsp" 
%>
<%
	String num1=request.getParameter("fval");
	String num2=request.getParameter("sval");
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int res=n1/n2;
		out.println("output is:"+res);
%>