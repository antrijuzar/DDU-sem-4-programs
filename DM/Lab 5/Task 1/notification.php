<?php
	session_start();
	if(!empty($_POST['uname']) && !empty($_POST['pass'])){
		if($_FILES['file']['type'] == "image/png" && $_FILES['file']['size'] <= 300000){
			echo "You are registered";
			echo "<table border='1 solid'>";
				echo "<tr>";
				echo "<td>Username:</td>";
				echo "<td>" . $_POST['uname'] . "</td>";
				echo "<td rowspan=7>";
				$location='D:/Workspace/DDU SEM 4 PROGRAMS/DM/Lab 5/Task 1/';
				if(move_uploaded_file($_FILES['file']['tmp_name'],$location.$_FILES['file']['name'])){
					echo '<img src ="'.$_FILES['file']['name'].'" width=100px height=100px/>';
				}
				echo "</td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td>Gender:</td>";
				echo "<td>" . $_POST['gen'] . "</td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td>Date of birth[YYYY-MM-DD]:</td>";
				echo "<td>" . $_POST['date'] . "</td>";
				echo "</tr>";
				echo "<tr>";
				$temp = $_POST['in'];
				if($temp[0]){
					echo "<td>Training:</td>";
					echo "<td>" . $temp[0] . "</td>";
					echo "</tr>";
				}else{
					echo "<td>Training:</td>";
					echo "<td>" . 'Not interested' . "</td>";
					echo "</tr>";
				}
				if($temp[1]){
					echo "<td>Placement:</td>";
					echo "<td>" . $temp[1] . "</td>";
					echo "</tr>";
				}else{
					echo "<td>Placement:</td>";
					echo "<td>" . 'Not interested' . "</td>";
					echo "</tr>";
				}
				echo "<td>Achievements:</td>";
				echo "<td>" . $_POST['achievements'] . "</td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td colspan=2><a href='../Task 1/''>Return Home</a></td>";
				echo "</tr>";
			echo "</table>";
		}else{
			$_SESSION['error'] = "Either file type is not appropriate or is greater than 300kb";
			header("Location: index.php");
			die();
		}
	}else {
		echo "Username or password empty";
	}
		
?>