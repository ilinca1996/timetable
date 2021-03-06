<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Timetable Application</title>

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
			<!-- To be define -->
			<h2></h2>
		</div>
		
		<div class="column middle">
			<h2>Students</h2>
			
			<!-- Add HTML table -->
			<table id="list" class="pure-table pure-table-horizontal">
				<tr>
					<th>First name</th>
					<th>Last name</th>
					<th>Phone Number</th>
					<th>Email</th>
					<th>Group</th>
					<th>Year of study</th>
				</tr>

				<!-- Loop over and print the Subjects -->
				<c:forEach var="tempStudent" items="${students}">
				
					<!-- Construct an update link with the subject id -->
					<c:url var="updateLink" value="/student/showFormForUpdateStudent">
						<c:param  name="studentId" value="${tempStudent.studentId}" />
					</c:url>
			
					<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.phoneNumber}</td>
						<td>${tempStudent.email}</td>
						<td>${tempStudent.group.groupNumber}</td>
						<td>
							<!-- Display the update link -->
							<a href="${updateLink}">Update</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			
			<!-- Adding the Add Subject button -->
			<!-- class = "add-button" is for CSS styles -->
			<input type="button" value="Add Student"
				onclick="window.location.href='showFormForAddStudent'; return false;"
				class="add-button" />		
		</div>
		
		<div class="column side">
			<h2>User Info</h2>
		</div>
	</div>

</body>
</html>