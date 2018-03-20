<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<tr><th>Nom</th><th>Prénom</th><th>age</th></tr>
<c:forEach var="u" items="${ utilisateurs }" >
	<tr><td><c:out value="${ u.prenom }" /></td>
	<td><c:out value="${ u.nom }" /></td>
	<td><c:out value="${ u.age }" /></td>
	</tr>
</c:forEach>
</table>

<c:out value="${ idc }" /><br />
Vous êtes identifié en tant que : 
<c:out value="${ user_session.nom }" />
</body>
</html>