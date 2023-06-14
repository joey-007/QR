<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Profile</title>
  <link rel="stylesheet" type="text/css" href="welcome.css">
</head>
<body>

  <div class="container">
    
    <div class="details">
      <h1>User Profile</h1>
      <div class="profile">
    <%String path= String.valueOf(session.getAttribute("filepath"));%>
    <figure>
      <img src="images/<%= path %>" alt="Profile Photo">
    </figure>
    </div>
      <form action="QRGener" method="post">
        <label for="name"><b>Name:</b></label>
        <label for="name"><%out.println(session.getAttribute("name")); %></label>
        
        <label for="phone"><b>Phone Number:</b></label>
        <label for="name"><%out.println(session.getAttribute("phone")); %></label>
        
        <label for="email"><b>Email:</b></label>
        <label for="name"><%out.println(session.getAttribute("email")); %></label>
        
        <label for="instagram"><b>Instagram ID:</b></label>
        <label for="name"><%out.println(session.getAttribute("insta")); %></label>
        
        <label for="snapchat"><b>Snapchat ID:</b></label>
        <label for="name"><%out.println(session.getAttribute("snap")); %></label>
        
        <label for="address"><b>Address:</b></label>
        <label for="name"><%out.println(session.getAttribute("address")); %></label>
        
        <label for="linkedin"><b>LinkedIn ID:</b></label>
        <label for="name"><%out.println(session.getAttribute("linkedin")); %></label>
        
        <input type="submit" value="Generate QR">
      </form>
    </div>
  </div>
</body>
</html>