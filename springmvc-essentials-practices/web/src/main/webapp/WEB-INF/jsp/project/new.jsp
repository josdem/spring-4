<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- document body -->
<html lang="en">
<head>
<jsp:include page="../_header.jsp" />
</head>

<body>

	<jsp:include page="../_menu.jsp" />

	<form:form commandName="project" method="post"
		action="${pageContext.request.contextPath}/saveProject">
		<div class="form-group">
			<label for="name">Name</label>
			<form:input path="name" htmlEscape="true" placeholder="New project"
				class="form-control" />
		</div>
		<div class="form-group">
			<label for="codeName">Code Name</label>
			<form:input path="codeName" htmlEscape="true"
				placeholder="PROJECT-CODE" class="form-control" />
		</div>
		<div class="form-group">
			<label for="description">Description</label>
			<form:textarea path="description" htmlEscape="true"
				class="form-control" rows="3" />
		</div>
		<button type="submit" class="btn btn-default">Create a new
			project</button>
	</form:form>
	
	<jsp:include page="../_footer.jsp"/>

</body>
</html>