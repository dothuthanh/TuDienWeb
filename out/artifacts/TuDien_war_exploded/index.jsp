<%--
  Created by IntelliJ IDEA.
  User: BipVuong
  Date: 6/18/2020
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charse=utf-8">
  <head>
    <title>ung dung tu </title>
    <link rel="stylesheet" href="css/style.css" type="text/css">
  </head>
  <body>
  <h2>Vietnamese Dictonary</h2>
  <form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your work: "/>
    <input type="submit" id="submit" value="Search"/>
  </form>
  </body>
</html>
