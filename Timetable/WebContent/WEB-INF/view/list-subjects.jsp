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
		<a href="#">Students</a>
	</div>
	
	<div class="content">
		<div class="column side">
			<!-- To be defined -->
			<h2></h2>
		</div>
		
		<div class="column middle">		
			<h2>Subjects</h2>
			
			<!-- Add HTML table -->
			<table id="list" class="pure-table pure-table-horizontal">
				<tr>
					<th>Subject Name</th>
					<th></th>
				</tr>

				<!-- Loop over and print the Subjects -->
				<c:forEach var="tempSubject" items="${subjects}">
				
					<!-- Construct an update link with the subject id -->
					<c:url var="updateLink" value="/subject/showFormForUpdateSubject">
						<c:param  name="subjectId" value="${tempSubject.subjectId}" />
					</c:url>
			
					<tr>
						<td>${tempSubject.subjectName}</td>
						<td>
							<!-- Display the update link -->
							<a href="${updateLink}">Update</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			
			<!-- Adding the Add Subject button -->
			<!-- class = "add-button" is for CSS styles -->
			<input type="button" value="Add Subject"
				onclick="window.location.href='showFormForAddSubject'; return false;"
				class="add-button" />
			
		</div>
		
		<div class="column side">
		<!-- To be defined -->
			<h2>User Info</h2>
		</div>	
	</div>

</body>

</html>