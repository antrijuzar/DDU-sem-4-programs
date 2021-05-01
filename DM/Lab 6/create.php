<?php
	require_once "config.php";
		if(isset($_POST["submit"])){
			// validate name
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
			$sql = 'INSERT INTO students(name,salary,address) VALUES(?,?,?)';
			if($stmt = mysqli_prepare($link,$sql)){
				mysqli_stmt_bind_param($stmt,"sis",$name,$salary,$address);
				$name = $_POST["name"];
				$salary = $_POST["salary"];
				$address = $_POST["add"];
				if(mysqli_stmt_execute($stmt)){
                	header("location: index.php");
                	exit();
           		} else{
               		echo "Something went wrong. Please try again later.";
            	}
			}
		}
?>
<form action="" method="post">
	<center>
		<h1>Create record</h1><br>
		Please fill this form and submit to add student record to database<br>
		Name:<input type="text" name="name"><br>
		Address:<textarea type="textarea" name="add" rows=2 cols=20></textarea><br>
		Salary:<input type="text" name="salary"><br>
		<input type="submit" name="submit" value="submit">
	</center>
</form>