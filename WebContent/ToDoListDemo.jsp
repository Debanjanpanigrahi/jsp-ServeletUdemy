
<%@ page import="java.util.*"  %>

<html>

<body>

<!-- steep 1 : create a HTML FORM -->
<form action="ToDoListDemo.jsp">

Add new item : <input type = "text" name = "theItem"/>

Submit <input type = "submit" value = "submit" />

</form>
<br/><br/>


<!-- STEEP 2 : ADD NEW ITEM TO todo list -->
<%

/*get TODO item from session*/

List<String> items = (List<String>) session.getAttribute("myTodoList");

/* if TODO does not exsists create a new one */
if(items == null){
	items = new ArrayList<String>();
	session.setAttribute("myTodoList",items);
}

/*see if there is form data to ddd*/

	String theItem = request.getParameter("theItem");
 	if(theItem != null) && (!theItem.trim().equals(""))){
		items.add(theItem);
	}
%>

<!-- steep 3 : Display all todo items from session -->
	<b>List item : </b>
	<br/>
	<ol>
	<%
    for(String item : items)
    {
%>

    <li><%= item %></li>

<%
    }
%>
	</ol>
</body>


</html>