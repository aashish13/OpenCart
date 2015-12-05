<%-- 
    Document   : header
    Created on : Dec 4, 2015, 8:31:27 PM
    Author     : Aashish
--%>
<%@page contentType="text/html" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<head>
    <title>Open Cart</title>

    <link href="https://fonts.googleapis.com/css?family=Lato:100" rel="stylesheet" type="text/css">
    <script src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
    <link href="<%=request.getContextPath()%>/style/bootstrap.min.css" rel="stylesheet" >
    <link href="<%=request.getContextPath()%>/style/main.css" rel="stylesheet" >
</head>
<body>
<header>
  <nav class="navbar navbar-default">
      <a class="navbar-brand" href="index.html">Open Cart</a>
      <div class="navbar-header">
        <ul class="nav navbar-nav">
          <li > <a href=#>Home</a> </li>
        </ul>
      </div>
      <p class="navbar-text navbar-right"><a href="login.html">Sign in</a></p>
  </nav>
</header>