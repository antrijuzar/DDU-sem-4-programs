<?php
	if(isset($_POST["submit"])){
		if($_POST["username"] == "admin" && $_POST["password"] == "admin"){
			header("Location: admin.php");
			exit();
		}
		if(substr(strrev($_POST["username"]), -1) == "s" && $_POST["password"] == $_POST["username"]){
			header("Location: student.php");
			exit();
		}
		if(strrev(substr(strrev($_POST["username"]), -3)) == "emp" && $_POST["password"] == $_POST["username"]){
			header("Location: employee.php");
			exit();
		}
	}
?>
<h1>Login</h1>
<form action="" method="POST">
	<table border="1"> 
		<tr>
			<td>Username:</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="Password" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="Submit Query"></td>
			<td><input type="Reset" name=""></td>
		</tr>
	</table>
</form>