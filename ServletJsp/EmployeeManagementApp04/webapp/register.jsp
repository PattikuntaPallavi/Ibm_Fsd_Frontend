<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

</head>
<body>
	<h1 >Registration Form</h1>
	<div>
		<form action="register.do" method="POST">
			
			<div>
				Employee Id:<input type="number" name="employeeId"/>
			</div>
			<br> 
			<div>
				Employee Name:<input type="text" name="employeeFirstName" />
			</div>
			<br>
			<div>
				DOB:<input type="date" name="DOB" />
			</div>
			<br>
			
			<div>
				Password:<input type="password" name="password" />
			</div>
			<br> 
			<div>
				Email:<input type="email" name="email" />
			</div>
			<br> 
			<div>City:
				<select name="city">
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Hyderabad">Hyderabad</option>
				<option value="Delhi">Delhi</option>
				
				</select>
			</div>
			<br> 
			<div>Skills:
				<input type="checkbox" name="skills" value="java" class="input" />Java
				<input type="checkbox" name="skills1" value="Oracle" class="input"/>Oracle
				<input type="checkbox" name="skills2" value="C#" class="input"/>C#
				<input type="checkbox" name="skills3" value="SAP" class="input"/>SAP
				
			</div>
			<br>
			
			<div>Gender:
				<input type="radio" name="gender" value="male" class="input"> Male
  <input type="radio" name="gender" value="female" class="input"> Female
				
				
			</div>
			<br> <input type="submit" value="submit" class="button" />
			<button type="reset" class="button">RESET</button>

		</form>
	</div>
</body>
</html>