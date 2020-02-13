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
			<h2>Today planning</h2>
		</div>
		
		<div class="column middle">
			
			<h2>Save Student</h2>

		<form:form action="showFormForAdd" modelAttribute="teacherSubject" method="GET">
			
			<table>
				<tbody>
					<tr>
						<td><label>First you must select the teacher : </label></td>
						<td><form:select path="teacher">
								<form:option value="NONE" label="Select teacher" />
								<form:options items="${teachers}" itemValue="teacherId" itemLabel="lastName"/>
						</form:select></td>
					</tr>
					
					<!-- Addind the submit button -->
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Load subjects" class="btn btn-primary" /></td>
					</tr>
					
				</tbody>
			</table>
			
			</form:form>
		</div>
		
		<div class="column side">
			<h2>User Info</h2>
		</div>
	</div>

</body>
</html>