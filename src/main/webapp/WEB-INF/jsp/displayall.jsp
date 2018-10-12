<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">



<title>Display Page</title>
</head>
<body>

<div>
<a href="#" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">
Cart (${sessionScope.cartSize})
</a>
</div>

	<div class="row" align="center">
		<c:forEach var="item" items="${sessionScope.products}">
			<div class="col-md-3">
				<div class="card" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title">${item.productId}</h5>
						<h6 class="card-subtitle mb-2 text-muted">${item.productName}</h6>
						<p class="card-text">${item.productPrice}</p>
						<a href="/addtocart/${item.productId}" class="card-link">Add to cart</a> 
					</div>
				</div>
			</div>
		</c:forEach>
		<br>
<div align="center" class="col-md-12">
<a href="#" button type="button" class="btn btn-primary btn-lg btn-block" >Order</button>
</a>
</div>
</body>
</html>