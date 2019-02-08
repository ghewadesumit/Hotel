<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String first_name = (String)request.getAttribute("first_name"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-xs-12">	
			<div class="jumbotron">
				<h1 class="display-4">Thank you <%= first_name %></h1>
			  	<p class="lead">Your review of our hotel is valuable and we would take efforts to make sure that your review will be taken seriously and acted upon.</p>
			  	<hr class="my-4">
			  	<p>Reviews given by our customers is our chance to improve ourselves to give them the service they deserve.</p>
			  	<p class="lead">
			    <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
			  	</p>
			  </div>
		</div>
	</div>
</div>

</body>
</html>