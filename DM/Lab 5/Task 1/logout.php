w<?php
	session_start();
	echo "Your are signed out Click <a href='index.php'>Here</a> to login again" ;
	unset($_SESSION['name']);
?>