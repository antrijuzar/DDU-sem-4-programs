<!DOCTYPE html>
<html>
<head>
	<title>
		Lab 6
	</title>
</head>
<body>
	<center> 
			<table border="1">
			<?php
				require_once  "config.php";
				$sql = 'SELECT * FROM students';
				if($result = mysqli_query($link,$sql)){
					if(mysqli_num_rows($result) > 0){
						echo "<tr>";
						echo "<th>#</th>";
						echo "<th>Name</th>";
						echo "<th>Address</th>";
						echo "<th>Salary</th>";
						echo "<th>Action</th>";
						echo "</tr>";
						while ($row = mysqli_fetch_array($result)) {
								echo "<tr>";
								echo "<td>".$row['id']."</td>";
								echo "<td>".$row['name']."</td>";
								echo "<td>".$row['address']."</td>";
								echo "<td>".$row['salary']."</td>";
								echo "<td><a href='view.php?id=".$row['id']."'>View Record</a>&nbsp<a href='update.php?id=".$row['id']."'>Update Record</a>&nbsp<a href='delete.php?id=".$row['id']."'>Delete Record</a>&nbsp</td>";;
								echo "</tr>";
						}
						echo "<h1><a href='create.php'>Create New Record</a></h1>";
					}else{
						echo "<h3>No record in the table please create a new record</h3>";
						echo "<h1><a href='create.php'>Create Record</a></h1>";
					}
				}else{
					die ("Error occured: ".mysql_error());
				}
			?>
			
		</table>
	</center>
</body>
</html>