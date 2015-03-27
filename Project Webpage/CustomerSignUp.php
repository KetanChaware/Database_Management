<html>
	<head>
		<link rel = "stylesheet" type = "text/css" href = "template.css" />
		
		<title> CRESCENT STEEL INDUSTRIES PVT. LTD.</title>

		<style type="text/css">
			#details{
				position:absolute;
				top: 250px;
				right: 500px;
				color: yellow;
				font-align:center;
			}
		</style>
		
		<!--<?php
		
			// Create connection to Oracle
			$conn = oci_connect("system", "iit", "//localhost/orcl");
			if (!$conn) {
				$m = oci_error();
				echo $m['message'], "\n";
				exit;
			}
			else {
				print "Connected to Oracle!";
			}
			// Close the Oracle connection
			oci_close($conn);
		
		?>-->
		
	</head>

	<body>
	
		<h1>
			<b> CRESCENT STEEL INDUSTRIES PVT. LTD. </b>
		</h1>

		<ul id = "list">
			<li><a href = "index.html">Home </a></li>
			<li><a href = "Products.html">Products</a></li>
			<li><a href = "employee.html">Employee</a></li>
			<li><a href = "customer.html">Customer</a></li>
			<li><a href = "contact.html">Contact us</a></li>
		</ul>
		<form action = "<?php $_PHP_SELF ?>" method="POST">
		<table id = "details" cellspacing = "20px">
			<tr>
				<td>Name </td>
				<td><input type="text" name="name"></br></td>
			</tr>
			<tr>
				<td>Address </td>
				<td><textarea name="address"></textarea></br></td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><input type="int" name="contactno"></br></td>
			</tr>
			<tr>
				<td>Email </td>
				<td><input type="text" name="email"></br></td>
			</tr>
			<tr>
				<td>Username </td>
				<td><input type="text" name="username"></br></td>
			</tr>
			<tr>
				<td>Password </td>
				<td><input type="password" name="password"></br></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="cpassword"></br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" >
			</tr>
		</table>
		</form>
		

			
	</body>


</html>