<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>

	<table border="1" >
		<th>Nombre del Alumno</th>
		<th>Fecha de Alta</th>
		<th>Asignatura</th>
		<th>Nombre del Profesor</th>

		<c:forEach var="listAlumnos" items="${model.listAlumnos}">

			<tr>
				<td>${listAlumnos[0]} ${listAlumnos[1]}</td>
				<td>${listAlumnos[4]}</td>
				<td>${listAlumnos[5]}</td>
				<td>${listAlumnos[2]} ${listAlumnos[3]}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>