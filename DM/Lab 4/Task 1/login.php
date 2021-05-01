
<h1>User login</h1><br>
<form action="" method="POST">
	Username: <input type="text" name="username" value=""><br>
	Password: <input type="Password" name="password" value=""><br>
	Remember me: <input type="checkbox" name="check"><br>
	<input type="submit" name="login" value="login"><br>
</form>
<?php
	if(isset($_POST['login'])){
		if(!empty($_POST['username']) && !empty($_POST['password'])){
			if(isset($_POST['check'])){
				if($_POST['username'] == "juzar" && $_POST['password'] == "juzar")
					if(!isset($_COOKIE['username']) && !isset($_COOKIE['password'])){
						echo "OK, so now cookie is set for 2 min...";
						setcookie('username',$_POST['username'],60*2+time());
						setcookie('password',$_POST['password'],60*2+time());
					}else{
						echo "You are already logged in..... ";
					}
				else
					echo "Username/Password Invalid";
			}else{
				if($_POST['username'] == "juzar" && $_POST['password'] == "juzar")
					if(!isset($_COOKIE['username']) && !isset($_COOKIE['password'])){
						echo "OK, so now cookie is set for 2 min...";
						setcookie('username',$_POST['username'],60*2+time());
						setcookie('password',$_POST['password'],60*2+time());
					}else{
						echo "You are already logged in..... ";
					}
				else
					echo "Username/Password Invalid";
			}
		}else {
			//if(empty($_POST['username']) || empty($_POST['password']))
			echo "You must supply a username and password";
		}
	}
		
	
	// if (!isset($_COOKIE['username']) !isset($_COOKIE['password'])) {
		
	// }
?>