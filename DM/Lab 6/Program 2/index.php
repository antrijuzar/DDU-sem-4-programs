<?php
	require_once("config.php");
	if(isset($_POST['submit'])){
		// juzar@antri.com' OR 1= 1 -- for sql injection
		$sql = "SELECT * FROM sqlinject WHERE uname = '".$_POST['uname']."' AND password = '".$_POST['upass']."'";
		if($result = mysqli_query($link,$sql)){
			if(mysqli_num_rows($result) > 0){
				echo "<table border='1'>";
				echo "<tr>";
				echo "<th>UserName</th>";
				echo "<th>Password</th>";
				echo "</tr>";
				while ($row = mysqli_fetch_array($result)) {
					echo "<tr>";
					echo "<td>".$row['uname']."</td>";
					echo "<td>".$row['password']."</td>";
					echo "</tr>";
				}
				exit();
				echo "</table>";
			}
		}
	}
?>

<form action="" method="post">
	Enter email and password to get data<br>
	email: &nbsp&nbsp&nbsp&nbsp&nbsp<input type='text' name='uname'/><br>
	password:<input type='password' name='upass'/><br>
	<input type="submit" name="submit"><br>
</form>
