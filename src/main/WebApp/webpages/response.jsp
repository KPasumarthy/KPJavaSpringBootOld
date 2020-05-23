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
	</nav>
	
	<!-- KP : The content below is only a placeholder and can be replaced.-->
	<div style="text-align: center">
		<h1>Welcome to Kailash Spring Boot Web Application : REST APIs!</h1>
	</div>
	
		<div class="container-fluid">
		<c:if test="${not empty city}">
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>CountryCode</th>
					<th>District</th>
					<th>Population</th>
						<tr>
							<td>${city.getId()}</td>
							<td>${city.getName()}</td>
							<td>${city.getCountryCode()}</td>
							<td>${city.getDisrtict() }</td>
							<td>${city.getPopulation()}</td>
						</tr>
				</tr>
			</table>
		</c:if>
	</div>
	</div>
		

	<div class="container-fluid">
		<c:if test="${not empty cities}">
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>CountryCode</th>
					<th>District</th>
					<th>Population</th>
					<c:forEach items="${cities}" var="cities">
						<tr>
							<td>${cities.id}</td>
							<td>${cities.name}</td>
							<td>${cities.countryCode}</td>
							<td>${cities.disrtict}</td>
							<td>${cities.population}</td>
						</tr>
					</c:forEach>
				</tr>
			</table>
		</c:if>
	</div>
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








