<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Subjects List</title>

<!-- Reference for CSS -->
<link type="text/css" rel="stylesheet" href="${pageContent.request.contextPath}/resources/css/style.css"/>

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>All the subjects</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!-- Add HTML table -->
			<table class="pure-table pure-table-horizontal">
				<tr>
					<th>Subject Name</th>
				</tr>
				
				<!-- Loop over and print the Subjects -->
				<c:forEach var="tempSubject" items="${subjects}">
					<tr>
						<td>${tempSubject.subjectName}</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
</body>

</html>