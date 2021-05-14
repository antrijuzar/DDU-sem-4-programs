<?php
	define('DB_SERVER','localhost');
	define('DB_PASSWORD','');
	define('DB_USERNAME','root');
	define('DB_NAME','DM_LAB_6');

	$link = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_NAME);

	if($link === false){
		die("Error: Could not connect.".mysqli_connect_error());
	} 
?>
