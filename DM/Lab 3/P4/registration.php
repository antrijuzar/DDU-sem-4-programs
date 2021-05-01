<form method="POST" action="notification.php" name="myForm" required>
	<table border="1">
		<tr>
			<td colspan="3">*Required field</td>
		</tr>
		<tr>
			<td colspan="1">*Username:</td>
			<td colspan="2"><input type="text" maxlength="11" minlength="1" name="uname"></td>
		</tr>
		<tr>
			<td colspan="1">*Email Address:</td>
			<td colspan="2"><input type="text" name="email"></td>
		</tr>
		<tr>
			<td colspan="1">*Password:</td>
			<td colspan="2"><input type="Password" name="pass" minlength="6" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="1">*Confirm Password:</td>
			<td colspan="2"><input type="Password" name="" minlength="6" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="1">*Gender:</td>
			<td colspan="2"><input type="radio" name="gen" value="Female">Female &nbsp<input type="radio" value="Male" name="gen">Male</td>
		</tr>
		<tr>
			<td colspan="3">Achievements:</td>
		</tr>
		<tr>
			<td colspan="3"><textarea name="achievements" rows="10" cols="40"></textarea></td>
		</tr>
		<tr>
			<td colspan="1"><input type="submit" name=""></td>
			<td colspan="1"><input type="reset" name=""></td>
			<td colspan="1"><a href="../P3/">Home</a></td>
		</tr>
	</table>
</form>
