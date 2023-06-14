<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Details</title>
<link rel="stylesheet" type="text/css" href="register.css">

</head>
<body>
  <form action="Register" method="post" enctype="multipart/form-data">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>
    
    <label for="phone">Phone Number:</label>
    <input type="tel" id="phone" name="phone" required><br><br>
    
    <label for="email">Email ID:</label>
    <input type="email" id="email" name="email" required><br><br>
    
    <label for="instagram">Instagram ID:</label>
    <input type="text" id="instagram" name="instagram" required><br><br>
    
    <label for="snapchat">Snapchat ID:</label>
    <input type="text" id="snapchat" name="snapchat"><br><br>
    
    <label for="address">Address:</label>
    <textarea id="address" name="address" rows="4" cols="30" required></textarea><br><br>
    
    <label for="linkedin">LinkedIn Profile:</label>
    <input type="url" id="linkedin" name="linkedin"><br><br>
    
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    
    <label for="photo">Photo Upload:</label>
    <input type="file" id="photo" name="photo"><br><br>
    
    <input type="submit" value="Submit">
  </form>


</body>
</html>