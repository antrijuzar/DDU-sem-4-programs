<?php
	session_start();
	require_once("config.php");
	echo "<table border='1'>";
	echo "<tr>";
	echo "<td><a href='home.php' >Home </a> <a href='index.php?out=1'>Signout </a></td>";
	echo "</tr>";
	echo "<tr>";
	$uname = $_SESSION['name'];
	echo "<td><h3>Welcome <u>$uname</u></h3></td>";
	echo "</tr>";
	echo "<tr>";
	echo "<td>";
	echo "<h4>Next month's list of birthdays</h4>";
	echo "</td>";
	echo "</tr>";
	$sql = "SELECT * FROM dobdata";
	if($result = mysqli_query($link,$sql)){
		if(mysqli_num_rows($result) > 0){
			while($row = mysqli_fetch_array($result)){
				$mon = explode("-", $row['dob']);
				$sysmon = getdate();
				if($mon[1] != $sysmon['mon']){
					echo "<tr>";
					echo "<td>".$row['name']."'s birthday is on ".$row['dob']."</td>";
					echo "</tr>";
				}				
			}
		}
	}
	echo "<tr>";
	echo "<td>";
	echo "<h4>This month's list of birthdays</h4>";
	echo "</td>";
	echo "</tr>";
	if($result = mysqli_query($link,$sql)){
		if(mysqli_num_rows($result) > 0){
			while($row = mysqli_fetch_array($result)){
				$mon = explode("-", $row['dob']);
				$sysmon = getdate();
				if($mon[1] == $sysmon['mon']){
					echo "<tr>";
					echo "<td>".$row['name']."'s birthday is on ".$row['dob']."</td>";
					echo "</tr>";
				}				
			}
		}
	}
	echo "<tr>";
	echo "<td><h4 style='margin: 0; color: green;'>One India, Clean India!!!</h4	></td>";
	echo "</tr>";
	echo "</table>";
?>