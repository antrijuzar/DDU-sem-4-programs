<?php
	require_once "config.php";
    session_start();
    $_SESSION['id'] = $_GET['id'];
        if(isset($_POST['yes'])){
            $id = $_SESSION['id'];
            $sql = "DELETE FROM students WHERE id = '".$id."'"; 
            if(mysqli_query($link,$sql)){
                header("Location: index.php");
                unset($_SESSION['id']);
                exit();
            }
        }  		
?>
<form action="" method="post">
    <h1>Delete Record</h1>
    Are you sure youn want to delete this record<br>
    <input type="submit" name="yes" value="Yes"> &nbsp&nbsp<a href="index.php">no</a>
</form>