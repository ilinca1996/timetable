<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>TimeTable Application</title>

<!-- Reference for CSS -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

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
			<h2>Teachers</h2>

			<!-- Adding the html table that will contain the teachers list -->
			<table id="list" class="pure-table pure-table-horizontal">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Phone Number</th>
					<th>Email</th>
					<th></th>
				</tr>

				<!-- Iterating over the list of teachers -->
				<c:forEach var="tempTeacher" items="${teachers}">

					<!-- Construct an update link with the subject id -->
					<c:url var="updateLink" value="/teacher/showFormForUpdateTeacher">
						<c:param name="subjectId" value="${tempTeacher.teacherId}" />
					</c:url>

					<tr>
						<td>${tempTeacher.firstName}</td>
						<td>${tempTeacher.lastName}</td>
						<td>${tempTeacher.phoneNumber}</td>
						<td>${tempTeacher.email}</td>
						<td>
							<!-- Display the update link --> <a href="${updateLink}">Update</a>
						</td>
					</tr>
				</c:forEach>

			</table>

			<!-- Adding the Add Subject button -->
			<!-- class = "add-button" is for CSS styles -->
			<input type="button" value="Add Teacher"
				onclick="window.location.href='showFormForAddTeacher'; return false;"
				class="add-button" />

		</div>
		
		<div class="column side">
			<h2>User Info</h2>
		</div>
		
	</div>
</body>
</html>