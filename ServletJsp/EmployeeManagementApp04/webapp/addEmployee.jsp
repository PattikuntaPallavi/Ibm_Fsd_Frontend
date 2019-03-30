<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

</head>
<body>
	<h1 align="center">Add Employee Form</h1>
	<div align="center">
		<form action="add.do" method="POST">
<div>
				Name:<input type="text" name="employeeName"
					placeholder="Enter EmployeeName" />
			</div>
			<br>
			<div>
				DOB:<input type="date" name="DOB" placeholder="select DOB" />
			</div>
			<br><div>
		Designation:<input type="text" name="designation"
					placeholder="Enter Designation" />
			</div>
			<br>
			<div>
		Email: <input type="email" name="emailId" placeholder="Enter Email" />
			</div>
			<br>
			<div>City:
				<select name="city">
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Hyderabad">Hyderabad</option>
				<option value="Mumbai">Mumbai</option>
				</select>
			</div>
			<br>
			<div>
				Department:<input type="text" name="department" placeholder="Enter Department" />
			</div>
			<br><div>
				Salary:<input type="number" name="salary" placeholder="Enter salary" />
			</div>
			<br>
			<div>Gender:
				<input type="radio" name="gender" value="male" class="input">
				Male <input type="radio" name="gender" value="female" class="input">
				Female 
				</div>
			<br> <input type="submit" value="submit" class="button" />
			<button type="reset" class="button">RESET</button>

		</form><br>
		<a href="success.jsp">Home</a>
	</div>
</body>
</html>