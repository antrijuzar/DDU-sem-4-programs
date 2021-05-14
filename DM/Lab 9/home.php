<?php
	session_start();
	if(!isset($_SESSION['name'])){
		header('Location: index.php?not=1');
		die();
	}
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
	echo "<td><h4 style='margin: 0; color: green;'>One India, Clean India!!!</h4	></td>";
	echo "</tr>";
	echo "</table>";
?>