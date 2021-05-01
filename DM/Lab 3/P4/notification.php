You are registered
<?php
	if(!empty($_POST['uname']) && !empty($_POST['pass'])){
		echo "<table border='1 solid'>";
			echo "<tr>";
			echo "<td>Username:</td>";
			echo "<td>" . $_POST['uname'] . "</td>";
			echo "</tr>";
			echo "<tr>";
			echo "<td>Password:</td>";
			echo "<td>" . $_POST['pass'] . "</td>";
			echo "</tr>";
			echo "<tr>";
			echo "<td>Email:</td>";
			echo "<td>" . $_POST['email'] . "</td>";
			echo "</tr>";
			echo "<tr>";
			echo "<td>Gender:</td>";
			echo "<td>" . $_POST['gen'] . "</td>";
			echo "</tr>";
			echo "<tr>";
			echo "<td>Achievements:</td>";
			echo "<td>" . $_POST['achievements'] . "</td>";
			echo "</tr>";
			echo "<tr>";
			echo "<td><a href='../P3/''>Return Home</a></td>";
			echo "</tr>";
		echo "</table>";
	}else {
		echo "Username or password empty";
	}
		
?>