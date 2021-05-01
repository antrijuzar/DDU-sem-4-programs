<?php
	$file = fopen('temp.txt', 'r');
	echo "fgets function does treats the html tag as html elements<br>";
	echo fgets($file);
	echo "<br>fgetss function does not treats the html tag as html elements and simply ignores it<br>";
	echo "<b>Its error bcz fgetss is depriicated</b>";
	fseek($file, 0);
	echo fgetss($file);
	fclose($file);
?>