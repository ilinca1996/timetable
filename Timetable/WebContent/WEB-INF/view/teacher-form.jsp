<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Timetable Application</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<!-- Add another stylesheet for add form : add-style.css -->

</head>
<body>

	<div class="header">
		<h1>Timetable Application</h1>
	</div>
	>

	<div class="topnav">
		<a href="${pageContext.request.contextPath}/teacher/list">Teachers</a>
		<a href="${pageContext.request.contextPath}/subject/list">Subjects</a>
		<a href="#">Students</a>
	</div>

	<div id="container">
		<h3>Save Teacher</h3>

		<form:form action="saveTeacher" modelAttribute="teacher" method="POST">
		
			<!-- Associate the data with the id - truck the teacher so that the backend knows which teacher is it about -->
			<form:hidden path="teacherId" />

			<table>
				<tbody>
					<tr>
						<td><label>Teacher first name :</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Teacher last name :</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Teacher phone number :</label></td>
						<td><form:input path="phoneNumber" /></td>
					</tr>
					<tr>
						<td><label>Teacher email :</label></td>
						<td><form:input path="email" /></td>
					</tr>

					<!-- Addind the save button -->
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				</tbody>
			</table>

		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/teacher/list">Back to
				the list of teachers</a>
		</p>

	</div>

</body>
</html>