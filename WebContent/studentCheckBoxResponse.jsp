<html>

<body>

<ul>
	<%
	
	String[] langs = request.getParameterValues("favLanguage");
	
	if(langs!=null){
		for(String lang : langs)
		{
			out.println("<li>"+ lang +"</li>");
		}
	}
	
	%>


</ul>

</body>

</html>