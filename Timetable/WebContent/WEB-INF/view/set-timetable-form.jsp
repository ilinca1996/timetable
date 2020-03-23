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

			<h2>Add a task to the timetable</h2>

			<form:form action="saveTimetable" modelAttribute="teacherSubject"
				method="POST">
				<table>
					<tbody>
						<!-- Select a teacher from combobox -->
						<tr>
							<td><label>Teacher</label></td>
							<td><form:select path="teacher.teacherId">
									<form:option value="NONE" label="Select teacher" />
									<form:options items="${teachers}" itemValue="teacherId" itemLabel="lastName"/>
								</form:select></td>
						</tr>

						<!-- Select a subject from combobox -->
						<tr>
							<td><label>Subject</label></td>
							<td><form:select path="subject.subjectId">
									<form:option value="NONE" label="Select subject" />
									<form:options items="${subjects}" itemValue="subjectId" itemLabel="subjectName"/>
								</form:select></td>
						</tr>

						<!-- Select a group from combobox -->
						<tr>
							<td><label>Group</label></td>
							<td><form:select path="group.groupId">
									<form:option value="NONE" itemValue="groupId" label="Select group" />
									<form:options items="${groups}" itemValue="groupId" itemLabel="groupNumber"/>
								</form:select></td>
						</tr>

						<!-- Select the day from combobox (Monday, Tuesday...) -->
						<tr>
							<td><label>Day</label></td>
							<td><form:select path="period.day">
									<form:option value="NONE" itemValue="periodId" label="Select time period" />
									<form:options items="${periods}" itemValue="periodId" itemLabel="day" itemLabel="startTime" itemLabel="endTime"/>
								</form:select></td>
						</tr>

						<!-- Insert starting hour -->
						<tr>
							<td><label>Starting hour</label></td>
							<td><form:input type="time" id="appt" name="appt" min="08:00"
										max="19:00" path="period.startTime" />
						</tr>

						<!-- Insert ending hour -->
						<tr>
							<td><label>Ending hour</label></td>
							<td><form:input type="time" id="appt" name="appt" min="09:00"
										max="20:00" path="period.endTime" /></td>
						</tr>

						<!-- Addind the save button -->
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
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