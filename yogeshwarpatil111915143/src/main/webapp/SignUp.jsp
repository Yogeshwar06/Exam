<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
	<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">Sign Up Page</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		  </div>
	</nav>
	<div class="container my-3">
		<h3>Student Enrollment Form</h3>
		<div class="container">
			<form action="Signup" method="post">
				Employee Id: <input class="my-3" type="text" name="uname" ><br>
				Password: <input class="my-3" type="password" name="pass"><br>
				First Name: <input class="my-3" type="text" name="fname" ><br>
				Last Name: <input class="my-3" type="text" name="lname" ><br>
				Date of Birth: <input class="my-3" type="text" name="dob" ><br>
				Contact: <input class="my-3" type="text" name="email" ><br>
				<input class="btn btn-primary my-3" type="submit" value="Submit">
				<a class="btn btn-outline-primary my-3 my-6 mx-3" href="login.jsp">Already an user?</a>
			</form>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
</body>
</html>