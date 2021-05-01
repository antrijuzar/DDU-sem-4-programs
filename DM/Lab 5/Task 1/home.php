<?php
	session_start();
	if(isset($_POST['submit'])){
		if(isset($_POST['username']) && isset($_POST['password'])){
			if($_POST['username'] == "juzar" && $_POST['password'] == "antri"){
				$_SESSION['name'] = $_POST['username'];
				echo "<table border='1'> ";
				echo "<tr>";
				echo "<td><h1>Home Page</h1></td>";
				echo "<td><a href='logout.php'>Signout</a></td>";
				echo "</tr>";
				echo "<tr>";
				echo "</tr>";
				echo "<td colspan='2'>Welcome " . $_POST['username'] . "</td>";
				echo "</table>";
			}else{
				echo "Incorrect Username/Password";
			}
		}
	}
?>