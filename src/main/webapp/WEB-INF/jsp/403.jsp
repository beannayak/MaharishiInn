<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	<%@ include file="templates/header.jsp"%>

	<div class="jumbotron">
		<div class="container">

			<h1>HTTP Status 403 - Access denied</h1>

                        <p>       | <%= request.getUserPrincipal().getName() %> |</p>
			<c:choose>
				<c:when test="${empty principal.username}">
					<h2>You do not have permission to access this page!</h2>
				</c:when>
				<c:otherwise>
					<h2>
						Username : ${principal.username} <br><br>You do not have permission to access
						this page!
					</h2>
				</c:otherwise>
			</c:choose>

		</div>

	</div>
</body>
</html>