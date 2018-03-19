<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="bonjour">
<fieldset>
   <label for="nom">Nom d'utilisateur</label>
   <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
   <br />
   <input type="submit" value="Inscription" class="sansLabel" />
   <br />
</fieldset>
</form>
<p> ${ erreur } </p>
<p> coucou </p>
</body>
</html>