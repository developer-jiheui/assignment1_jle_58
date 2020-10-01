<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head>
<body>
	<h1>Student Information</h1>
	<form:form method="POST" modelAttribute="student">

		<table>
			<tr>
				<td><label>Domestic</label><br> 
				<form:radiobutton path="typeOfStudent" id="domestic" value="Domestic" /> 
				<form:errors path="typeOfStudent" style="color:red" /></td>
				<td><label>International</label><br> 
				<form:radiobutton  path="typeOfStudent" id="international" value="International"/> 
				<form:errors path="typeOfStudent" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input type="text" path="firstName" id="firstName" />
					<form:errors path="firstName" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input type="text" path="lastName" id="lastName" /> <form:errors
						path="lastName" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Semester</label></td>
				<td><form:select path="semester" id="semester">
						<form:option value="">Select Semester</form:option>
						<form:options value="" items="${semester}" />
					</form:select> <form:errors path="semester" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Course 1</label></td>
				<td><form:select path="grade1" id="grade1">
						<form:option value="">Select Grade</form:option>
						<form:options items="${grade}" />
					</form:select> <form:errors path="grade1" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Course 2</label></td>
				<td><form:select path="grade2" id="grade2">
						<form:option value="">Select Grade</form:option>
						<form:options items="${grade}" />
					</form:select> <form:errors path="grade2" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Course 3</label></td>
				<td><form:select path="grade3" id="grade3">
						<form:option value="">Select Grade</form:option>
						<form:options items="${grade}" />
					</form:select> <form:errors path="grade3" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Course 4</label></td>
				<td><form:select path="grade4" id="grade4">
						<form:option value="">Select Grade</form:option>
						<form:options items="${grade}" />
					</form:select> <form:errors path="grade4" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Course 5</label></td>
				<td><form:select path="grade5" id="grade5">
						<form:option value="">Select Grade</form:option>
						<form:options items="${grade}" />
					</form:select> <form:errors path="grade5" style="color:red" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>