<?php
	if(isset($_POST["submit"]) && !empty($_POST["name"]) && !empty($_POST["pass"]) 
	   && !empty($_POST["email"]) && !empty($_POST["mob"])){
	   	$name = $_POST["name"];
	   	$pass = $_POST["pass"];
	   	$email= $_POST["email"];
	   	$mobile = $_POST["mob"];
	   	$np = "/^[A-Z][$-_]{1}[a-z0-9]{3,12}/";
	   	$pp = "/[A-Za-z0-9]/";
	   	$ep = "/[_a-z0-9-.A-Z$]+@+[a-z.]*/";
	   	$mp = "/[+0-9]+[- 0-9]/";
		if(preg_match($np, $name)){
			echo "Welcome, $name<br>";
			if(preg_match($pp, $pass)){
				if(preg_match($ep, $email)){
					echo "Your email is $email<br>";
					if(preg_match($mp, $mobile)){
						if(substr(strrev($mobile), -1) == "+"){
							echo "Your mobile number with country code is $mobile <br>";
						}else{
							echo "Your mobile number without country code is $mobile <br>";
						}
					}else{
						echo "Mobile No is Invalid<br>";
					}	
				}else{
					echo "Email is Invalid<br>";
				}	
			}else{
				echo "Password is Invalid<br>";
			}
		}else{
			echo "Name is Invalid<br>";
		}
	}
?>
<form action="" method="post">
Name: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" name="name" minlength="5" maxlength="12"><br>
Password: &nbsp&nbsp<input type="password" name="pass" minlength="10" maxlength="10"><br>
Email: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" name="email"><br>
Moblie No: <input type="text" name="mob"><br>
<input type="submit" name="submit">
</form>