<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<div class="topnav">
		<a href="${pageContext.request.contextPath}/teacher/list">Teachers</a>
		<a href="${pageContext.request.contextPath}/subject/list">Subjects</a>
		<a href="${pageContext.request.contextPath}/student/list">Students</a>
		<a href="${pageContext.request.contextPath}/group/list">Groups</a>
	</div>
	
	<div class="content">
		<div class="column side">
			<!-- To be defined -->
			<h2></h2>
		</div>
		
		<div class="column middle">
			
			<h2>Save Student</h2>

		<form:form action="saveStudent" modelAttribute="student" method="POST">

			<!-- Associate the data with the id - truck the subject so that the backend knows which Subject is it about -->
			<form:hidden path="studentId" />

			<table>
				<tbody>
					<tr>
						<td><label>First name :</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name :</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Phone number :</label></td>
						<td><form:input path="phoneNumber" /></td>
					</tr>
					<tr>
						<td><label>Email :</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>Group :</label></td>
						<td><form:select path="group">
								<form:option value="NONE" label="Select group" />
								<form:options items="${groups}"/>
						</form:select></td>
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
			<a href="${pageContext.request.contextPath}/student/list">Back to
				the list of students</a>
		</p>
					
		</div>
		
		<div class="column side">
			<h2>User Info</h2>
		</div>
	</div>

</body>
</html>