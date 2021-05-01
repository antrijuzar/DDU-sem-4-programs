<?php
	if(file_exists('temp.txt')){
		rename('temp.txt','new.txt');
		echo "file renamed successfully";
	}else {
		echo "File does not exists";
	}
?>