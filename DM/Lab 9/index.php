<?php
	session_start();
	if(isset($_POST['submit'])){
		require_once  "config.php";
		$name = $_POST['username'];
		$password = $_POST['password'];
		$sql = "SELECT * FROM sqlinject WHERE uname = '".$name."' && password = '".$password."'";
		if($result = mysqli_query($link,$sql)){
			if(mysqli_num_rows($result) > 0){
				$_SESSION['name'] = $name;
				header('Location: home.php');
				die();
			}else{
				echo "<form action='' method='POST'>";
				echo "<table border='1'>";
				echo "<tr>";
				echo "<td colspan='2'><h3 style='margin: 0; color: green; margin-left: 5%;'>INVALID LOGIN DETAIL</h3></td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td>Username:</td>";
				echo "<td><input type='text' name='username'></td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td>Password:</td>";
				echo "<td><input type='Password' name='password'></td>";
				echo "</tr>";
				echo "<center>";
				echo "<tr>";
				echo "<td><input type='submit' name='submit' value='Submit' style='margin-left: 70%'></td>";
				echo "<td><input type='reset' name='reset' value='Reset' style='margin-left: 30%'></td>";
				echo "</tr>";
				echo "</center>";
				echo "</table>";
				echo "</form>";
				die();
			}
		}
	}
	if(isset($_GET['out'])){
		unset($_SESSION['name']);
		echo "<form action='' method='POST'>";
		echo "<table border='1'>";
		echo "<tr>";
		echo "<td colspan='2'><h4 style='margin: 0; color: green; margin-left: 8%;'>You have successfully Logout</h4></td>";
		echo "</tr>";
		echo "<tr>";
		echo "<td>Username:</td>";
		echo "<td><input type='text' name='username'></td>";
		echo "</tr>";
		echo "<tr>";
		echo "<td>Password:</td>";
		echo "<td><input type='Password' name='password'></td>";
		echo "</tr>";
		echo "<center>";
		echo "<tr>";
		echo "<td><input type='submit' name='submit' value='Submit' style='margin-left: 70%'></td>";
		echo "<td><input type='reset' name='reset' value='Reset' style='margin-left: 30%'></td>";
		echo "</tr>";
		echo "</center>";
		echo "</table>";
		echo "</form>";
		die();
	}
	if(isset($_GET['not'])){
		unset($_SESSION['name']);
		echo "<form action='' method='POST'>";
		echo "<table border='1'>";
		echo "<tr>";
		echo "<td colspan='2'><h4 style='margin: 0; color: green;'>Please login to View Your Home Screen!</h4></td>";
		echo "</tr>";
		echo "<tr>";
		echo "<td>Username:</td>";
		echo "<td><input type='text' name='username'></td>";
		echo "</tr>";
		echo "<tr>";
		echo "<td>Password:</td>";
		echo "<td><input type='Password' name='password'></td>";
		echo "</tr>";
		echo "<center>";
		echo "<tr>";
		echo "<td><input type='submit' name='submit' value='Submit' style='margin-left: 70%'></td>";
		echo "<td><input type='reset' name='reset' value='Reset' style='margin-left: 30%'></td>";
		echo "</tr>";
		echo "</center>";
		echo "</table>";
		echo "</form>";
		die();
	}
?>

<form action="" method="POST">
	<table border="1"> 
		<tr>
			<td colspan="2"><h3 style="margin: 0; color: green; margin-left: 8%;">Our India, Clean India!!!</h3></td>
		</tr>
		<tr>
			<td>Username:</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="Password" name="password"></td>
		</tr>
		<center>
		<tr>
			<td><input type="submit" name="submit" value="Submit" style="margin-left: 70%"></td>
			<td><input type="Reset" name="" style="margin-left: 30%"></td>
		</tr>
		</center>
	</table>
</form>