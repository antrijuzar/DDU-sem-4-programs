<?php
	require_once "config.php";
		$id = $_GET['id'];
		$sql = "SELECT * FROM students WHERE id = '".$id."'"; 
		if($result = mysqli_query($link,$sql)){
            if(mysqli_num_rows($result) > 0){
                $row = mysqli_fetch_array($result);
                echo "<h1>View record</h1>";
                echo "<h3><b>Name</b></h3>";
                echo $row['name']."<br>";
                echo "<h3><b>Address</b></h3>";
                echo $row['address']."<br>";
                echo "<h3><b>Salary</b></h3>";
                echo $row['salary']."<br>";
                echo "<h5><a href='index.php'>Back</a><br>";
            }
		}
?>