<?php
	session_start();
	if(isset($_POST['setrem'])){
		require_once("config.php");
		$name=$_POST['name'];
		$date=$_POST['dob'];
		$sql="INSERT INTO dobdata VALUES(?,?)";
		if($stmt = mysqli_prepare($link,$sql)){
			mysqli_stmt_bind_param($stmt,"ss",$name,$date);
			if(mysqli_stmt_execute($stmt)){
				echo "<table border='1'>";
				echo "<tr>";
				echo "<td><a href='home.php' >Home </a> <a href='index.php?out=1'>Signout </a></td>";
				echo "</tr>";
				echo "<tr>";
				$uname = $_SESSION['name'];
				echo "<td><b>Welcome <u>$uname</u></b></td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td>";
				echo "<ol><li><a href='set.php' >Set reminder </a></li><li><a href='notify.php' >Show reminders </a></li></ol>";
				echo "</td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td style='text-align:center'><h4 style='margin: 0; color: green;'>Reminder is set!</h4	></td>";
				echo "</tr>";
				echo "</table>";
				exit();
           	} else{
               	echo "Something went wrong. Please try again later.";		
            }
		}
	}
?>
<form action='' method='POST'>
	<table border='1'>
	<tr>
	<td colspan="2"><a href='home.php' >Home </a> <a href='index.php?out=1'>Signout </a></td>
	</tr>
	<tr>
	<?php $uname = $_SESSION['name'];?>
	<td colspan="2">Welcome <u><?php echo $uname; ?></u></td>
	</tr>
	<tr>
	<td >Name</td>
	<td><input type='text' name='name'></td>
	</tr>
	<td>Birthdate</td>
	<td><input type='date' name='dob'></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type='submit' name='setrem' value='Set reminder'></td>
	</tr>
	</table>
</form>