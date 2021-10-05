<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >

<meta charset="ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<body class="">
<div class="card bg-light " style="width:30%; margin-left:auto; margin-top:10px;
        margin-right:auto; " >
<div class="card-header d-flex justify-content-center font-weight-bold">REGISTRATION FORM</div>
<form action="Registered" method="post" class="w-75 form-group ml-5 mt-2">
<label class="form-label mt-1" >User Name</label>
<input type="text" class="form-control"  required name="username"/>
<label class="form-label mt-1">Password</label>
<input type="password" required class="form-control" name="password"/>
<label class="form-label mt-1">E mail</label>
<input type="email" required  class="form-control" name="email"/>
<label class="form-label mt-1">Phone</label>
<input type="tel" 
       required class="form-control"name="contact"/>
<input class="btn  btn-success mt-2 btn-block" type="submit" value="Register" />
</form>
</div>

</body>
</html>