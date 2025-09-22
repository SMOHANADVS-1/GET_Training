<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<link rel="stylesheet" href="style/employee.css">

</head>
<body>

<h1>Employee Details</h1>

<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Password</th>
    <th>Email</th>
    <th>Sex</th>
    <th>Country</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>

  <c:forEach items="${elist}" var="u">
    <tr>
      <td>${u.getId()}</td>
      <td>${u.getName()}</td>
      <td>${u.getPassword()}</td>
      <td>${u.getEmail()}</td>
      <td>${u.getSex()}</td>
      <td>${u.getCountry()}</td>
      <td><a href="editForm.jsp?id=${u.getId()}">Edit</a></td>
      <td><a href="deleteUser.jsp?id=${u.getId()}">Delete</a></td>
    </tr>
  </c:forEach>
</table>

<a href="addUser.jsp" class="add-user-link">Add New User</a>
</body>
</html>