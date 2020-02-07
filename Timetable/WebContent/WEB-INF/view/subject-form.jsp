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
		<a href="#">Students</a>
	</div>

	<div id="container">
		<h3>Save Subject</h3>

		<form:form action="saveSubject" modelAttribute="subject" method="POST">

			<!-- Associate the data with the id - truck the subject so that the backend knows which Subject is it about -->
			<form:hidden path="subjectId" />

			<table>
				<tbody>
					<tr>
						<td><label>Subject name :</label></td>
						<td><form:input path="subjectName" /></td>
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
			<a href="${pageContext.request.contextPath}/subject/list">Back to
				the list of subjects</a>
		</p>

	</div>

</body>
</html>