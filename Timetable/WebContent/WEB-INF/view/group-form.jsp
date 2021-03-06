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

			<form:form action="saveGroup" modelAttribute="group" method="POST">

				<!-- Associate the data with the id - truck the subject so that the backend knows which Subject is it about -->
				<form:hidden path="groupId" />

				<table>
					<tbody>
						<tr>
							<td><label>Year :</label></td>
							<td><form:input path="year" value="1" disabled="true"/></td>
						</tr>

						<tr>
							<td><label>Group number :</label></td>
							<td><form:input path="groupNumber" /></td>
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
				<a href="${pageContext.request.contextPath}/group/list">Back to
					the list of groups</a>
			</p>

		</div>

		<div class="column side">
			<h2>User Info</h2>
		</div>
	</div>

</body>
</html>