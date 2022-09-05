<!-- 
Casey Kreps

Display Form using JSP/  HTML

Kreps Final Assignment

August 23, 2022
 -->


		
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm</title>
<link rel="stylesheet" href="index1css.css">

</head>
<body style="background-color: #5a7233;">


<h1>Confirm for submission</h1>
 <form  name="myform" action="RegisterServlet" method="GET" class="decor">
	<%
	
			
	String Id = request.getParameter("Id");
	String First = request.getParameter("First");
	String Last = request.getParameter("Last");
	String Email = request.getParameter("Email");
	String Phone = request.getParameter("Phone");
	

	
		
	%>

<table border="1">
<tbody>

<tr>
	<td>ID : </td>
	<td><%=Id %></td>
</tr>
<tr>
	<td>First Name : </td>
	<td><%=First %></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><%=Last %></td>
</tr>
<tr>
	<td>Email : </td>
	<td><%=Email %></td>
</tr>
<tr>
	<td>Phone : </td>
	<td><%=Phone %></td>
</tr>



</tbody>
</table>
<input type="hidden" name="first" value="<%= First %>" />
<input type="hidden" name="last" value="<%= Last %>" />
<input type="hidden" name="id" value="<%= Id %>" />
<input type="hidden" name="email" value="<%= Email %>" />
<input type="hidden" name="phone" value="<%= Phone %>" />

		<div>	
        <button class="button-3" role="button"  type="submit" value="Submit" name="submit" >Submit to Database</button>

     	</div>
    </form>
    
    <form  name="emailform" action="MailServlet" method="post" class="decor">
	<% 
	String Email1 = request.getParameter("Email");
	%>
	
	<input type="hidden" name="email1" value="<%= Email1 %>" />
    <button class="button-3" role="button"  type="submit" value="Submit" name="submit" >Submit to Email</button>
    </form>
  </body>

</html>