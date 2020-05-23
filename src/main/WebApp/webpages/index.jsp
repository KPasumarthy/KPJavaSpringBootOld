<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Kailash Spring Boot Application & REST APIs!</title>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">
<link href="../css/skin.css" rel="stylesheet">
<link href="../css/pricingCol.css" rel="stylesheet">
<!-- KP : <link rel="stylesheet" href="css/font-awesome.min.css">-->
<link rel="stylesheet" href="../css/bootstrap-grid.min.css" />
<link href="../css/StyleSheet.css" rel="stylesheet" />

<script src="../js/jquery.min.js" type="text/javascript"></script>
<script src="../js/jsCall2SpringBootServlet.js" type="text/javascript"></script>
<script src="../js/elementTransitions.min.js" type="text/javascript"></script>
<script src="../js/modernizr.custom.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>

<style type="text/css">
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>


<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="row">
		<div class="col-md-12">
			<div id="header" class="clearfix">
				<img class="header" role="img"
					aria-label="This is the main header logo"
					src="../images/KPIcon32x32.ico" alt="logo">
			</div>
		</div>
	</div>
	</nav>

	<!-- KP : The content below is only a placeholder and can be replaced.-->
	<div style="text-align: center">
		<h1>Welcome to Kailash Spring Boot Web Application : REST APIs!</h1>
	</div>


	<div class="container-fluid">
		<h4>CRUD - HTTP : GET</h4>
		<form name="myForm" method="get" action="/city">
			City ID : <input type="text" name="id" value="27" /> 
			<input type="submit" value="Get" />
		</form>
	</div>

	<div class="container-fluid">
		<h4>CRUD - HTTP : GET ALL</h4>
		<form name="myForm" method="get" action="/cities">
			<input type="submit" value="Get" />
		</form>
	</div>

	<div class="container-fluid">
		<h4>CRUD - HTTP : POST</h4>
		<form name="myForm" method="post" action="/city">
			City ID    : <input type="text" name="id" value="4081" /> </br>
			City Name  : <input type="text" name="name" value="" /> 	</br>
			Country Code  : <input type="text" name="countryCode" value="IND" />	</br>
			District Name : <input type="text" name="disrtict" value="Nityananda"/> </br>
			Population    : <input type="text" name="population" value="999"/> </br>
			<input type="submit" value="Post" />
		</form>
	</div>

	<div class="container-fluid">
		<h4>CRUD - HTTP : UPDATE</h4>
		<form name="myForm" method="update" action="/city">
			Country ID    : <input type="text" name="id" value="4080" /> </br>
			Country Name  : <input type="text" name="name" value="Mudinepalli" /> 	</br>
			Country Code  : <input type="text" name="countryCode" value="IND" />	</br>
			District Name : <input type="text" name="disrtict" value="Andhra Pradesh"/> </br>
			Population    : <input type="text" name="population" value="99999"/> </br>
			<input type="submit" value="Update" />
		</form>
	</div>


	<div class="container-fluid">
		<h4>CRUD - HTTP : DELETE</h4>
		<form name="myForm" method="delete" action="/api/city">
			Country ID    : <input type="text" name="id" value="4081" /> </br>
			Country Name  : <input type="text" name="name" value="Mudinepalli" /> 	</br>
			Country Code  : <input type="text" name="countryCode" value="IND" />	</br>
			District Name : <input type="text" name="disrtict" value="Andhra Pradesh"/> </br>
			Population    : <input type="text" name="population" value="99999"/> </br>
			<input type="submit" value="Delete" />
		</form>
	</div>

	<!-- Footer -->
	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy; Your
			Website 2019</p>
	</div>
	</footer>


</body>

</html>







