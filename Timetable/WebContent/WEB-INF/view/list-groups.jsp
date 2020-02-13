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
			
			<h2>Groups</h2>

			<!-- Adding the html table that will contain the teachers list -->
			<table id="list" class="pure-table pure-table-horizontal">
				<tr>
					<th>Year</th>
					<th>Group Number</th>
				</tr>

				<!-- Iterating over the list of groups -->
				<c:forEach var="tempGroup" items="${groups}">

					<!-- Construct an update link with the subject id -->
					<c:url var="groupStudents" value="/student/showFormForGroupStudents">
						<c:param name="groupId" value="${tempGroup.groupId}" />
					</c:url>

					<tr>
						<td>${tempGroup.year}</td>
						<td>${tempGroup.groupNumber}</td>
						<td>
							<!-- Display the group students --> <a href="${groupStudents}">Show students</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			
			<!-- Adding the Add Subject button -->
			<!-- class = "add-button" is for CSS styles -->
			<input type="button" value="Add Group"
				onclick="window.location.href='showFormForAddGroup'; return false;"
				class="add-button" />
			
		</div>
		
		<div class="column side">
			<h2>User Info</h2>
		</div>
	</div>
	
</body>
</html>