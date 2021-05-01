<?php
	require_once "config.php";
	if(isset($_POST['submit'])){
			if(empty($_POST["name"])){
        		die("Please enter a name.");
    		} elseif(!filter_var($_POST["name"], FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z\s]+$/")))){
        		die("Please enter a valid name.");
    		}
    
    		// Validate address
    		if(empty($_POST["add"])){
        		die("Please enter an address.");     
    		}
    
    		// Validate salary
    		if(empty($_POST["salary"])){
    		    die("Please enter the salary amount.");     
    		} elseif(!ctype_digit($_POST["salary"])){
    		    die("Please enter a positive integer value.");
    		}
		$id = $_GET['id'];
		$sql = "UPDATE students SET name ='". $_POST['name']."', salary ='". $_POST['salary']."',address ='". 
		        $_POST['add']."' WHERE id = '".$id."'"; 
		if(mysqli_query($link,$sql)){
			header("Location: index.php");
			exit();
		}
	}
?>
<form action="" method="post">
	<center>
		<h1>Create record</h1><br>
		Please edit the input values and submit to update the record <br>
		Name:<input type="text" name="name"><br>
		Address:<textarea type="textarea" name="add" rows=2 cols=20></textarea><br>
		Salary:<input type="text" name="salary"><br>
		<input type="submit" name="submit" value="submit">
	</center>
</form>