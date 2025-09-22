<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.time.LocalDateTime"
    info = "Created by Mohana during JSP Training"
    buffer="16kb"
    errorPage="myerrorPage.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directive Demo</title>
</head>
<body>
<h1>Page Directives Demo</h1>
<p>Today is : <%= LocalDateTime.now() %><p>
<p><%= 100/10 %><p>
<p><%= 100/10 %><p>

<p><%= getServletInfo() %><p>
<p>Buffer Size is  : <%= pageContext.getResponse().getBufferSize() %><p>
<p>Character Encoding is : <%= pageContext.getResponse().getCharacterEncoding() %><p>
<p>Content Type is : <%= pageContext.getResponse().getContentType() %><p>


</body>
</html>