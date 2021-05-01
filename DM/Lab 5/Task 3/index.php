<?php
	$file = fopen('temp.txt', 'r');
	echo fread($file,ftell($file)+1);
	fclose($file)
?>