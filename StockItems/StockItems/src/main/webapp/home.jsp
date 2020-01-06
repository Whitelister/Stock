<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock</title>
</head>
<body>

<h2>Stock</h2>

	<form action="addItem">
	    Add item: <br>
	    Item no:	<input type="text" name="itemNo"><br>
	    Name:  <input type="text" name="name"><br>
		Amount:  <input type="text" name="amount"><br>
		Inventory code:  <input type="text" name="inventoryCode"><br>
	    <input type="submit"><br>
	</form><br>

	<form action="getAllItems">
	     Get all items:<br>
	     <input type="submit"><br>
	</form><br>

	<form action="getItem">
	     Get item by item no:<br>
	     Item no:	<input type="text" name="itemNo"><br>
		 <input type="submit"><br>
	</form><br>

	<form action="deleteItem">
	      Delete item by item no:<br>
	      Item no:	<input type="text" name="itemNo"><br>
		 <input type="submit"><br>
	</form><br>
	
	<form action="depositItem">
	      Deposit item by item no & amount:<br>
	      Item no:	<input type="text" name="itemNo"><br>
	      Amount:	<input type="text" name="amount"><br>
		 <input type="submit"><br>
	</form><br>
	
	<form action="getItemQuantity">
	      Get item quantity by item no:<br>
	      Item no:	<input type="text" name="itemNo"><br>
		 <input type="submit"><br>
	</form>

</body>
</html>