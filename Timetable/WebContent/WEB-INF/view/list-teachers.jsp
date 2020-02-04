<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Teachers List</title>

<!-- Reference for CSS -->
<link type="text/css" rel="stylesheet" href="${pageContent.request.contextPath}/resources/css/style.css"/>

</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>All the teachers</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!-- Adding the html table that will contain the teachers list -->
			<table class="pure-table pure-table-horizontal">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Phone Number</th>
					<th>Email</th>
				</tr>
				
				<!-- Iterating over the list of teachers -->
				<c:forEach var="tempTeacher" items="${teachers}">
					<tr>
						<td>${tempTeacher.firstName}</td>
						<td>${tempTeacher.lastName}</td>
						<td>${tempTeacher.phoneNumber}</td>
						<td>${tempTeacher.email}</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>

</body>
</html>