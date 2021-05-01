<?php
	$file = fopen('temp.txt', 'r');
	echo fread($file, 10);
	fclose($file)
?>