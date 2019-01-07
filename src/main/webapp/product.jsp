<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src= "cart.js"></script>

		<form action="http://localhost/8888/checkout" method="post">
			<table>
			<tr>
			<td>Product Name</td> 
			<td><input  type="text" id="pname" name="pname"></td>
			</tr>
			  <tr>
				<td>Quantity</td>
				<td><input  type="text" id="qty" name="qty"></td>
				</tr>
				<tr>
				<td>Price </td>
				 <td><input type="text" id="pp" name="pp"></td>
				</tr>
				<tr>
			    <td><label id = "addtocart">Add to Cart</label></td>
				<td><input type="submit" value="Submit"></td>
				</tr>
				</table>
				</form>

</body>
</html>