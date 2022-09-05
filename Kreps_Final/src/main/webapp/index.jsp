<!-- 
Casey Kreps

Registration Form using HTML/JSP

Kreps Final Assignment

August 25, 2022
 -->


		




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="style.css">

</head>
<body>

    <form name="myform" action="index1.jsp" method="get" class="decor">
    
      <div class="form-left-decoration"></div>
      <div class="form-right-decoration"></div>
      <div class="circle"></div>
      <div class="form-inner">
        <h1>Register</h1>
        
        <input type="text" name = "First" placeholder="First Name" required>
        <input type="text" name="Last" placeholder="Last Name" required>
        <input type="email" name="Email" placeholder="Email" required>
        <input type="text" name="Id" placeholder="ID" required>
        <input type="text" name="Phone" placeholder="Phone Number" required>
        <button  type="submit" value="Submit" name="submit" >Submit</button>

      </div>
    </form>
    
  </body>
</html>