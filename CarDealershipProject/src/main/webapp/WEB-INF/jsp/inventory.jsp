<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Car Dealership</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">Car Dealership</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="/home">Home</a>
        <a class="nav-link" href="/sign-up">Sign Up</a>
        <a class="nav-link" href="/log-in">Log In</a>
      </nav>
    </div>
  </header>

  <main role="main" class="inner cover">
     
     
<p class="lead"></p>
			<table class="table table-hover">
				<thead class="table-light">
					<tr>
						<th scope="col">Stock Number</th>
						<th scope="col">Manufacturer</th>
						<th scope="col">Make</th>
						<th scope="col">Model</th>
						<th scope="col">Style</th>
						<th scope="col">Transmission</th>
						<th scope="col">Mileage</th>
						<th scope="col">Color</th>
						<th scope="col">Used?</th>
						<th scope="col">Description</th>
						<th scope="col">Date Listed</th>
						<th scope="col">Price</th>
						<th scope="col">Image</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vehicles}" var="vehicle">
						<!--use java field names from vehicle.java -->
		
						<tr>
							<td>${vehicle.stockNumber}</td>
							<td>${vehicle.manufacturer}</td>
							<td>${vehicle.make}</td>
							<td>${vehicle.model}</td>
							<td>${vehicle.style}</td>
							<td>${vehicle.transmission}</td>
							<td>${vehicle.mileage}</td>
							<td>${vehicle.color}</td>
							<td>${vehicle.used}</td>
							<td>${vehicle.description}</td>
							<td>${vehicle.dateListed}</td>
							<td>${vehicle.price}</td>
							<td>${vehicle.imagePath}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>



  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
    </div>
  </footer>
</div>


</body>

</html>
