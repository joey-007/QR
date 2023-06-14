<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<figure>
      <img src="QrPhotos/<%= String.valueOf(session.getAttribute("name")) %>.png" alt="Profile Photo">
</figure>
</body>
</html>