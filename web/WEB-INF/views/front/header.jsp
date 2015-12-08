<%-- 
    Document   : header
    Created on : 7-Dec-2015, 4:04:29 AM
    Author     : esha
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" %>

<head>
    <title>Open Cart</title>

    <link href="https://fonts.googleapis.com/css?family=Lato:100" rel="stylesheet" type="text/css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/main.js"></script>
    <link href="<%=request.getContextPath()%>/style/bootstrap.min.css" rel="stylesheet" >
    <link href="<%=request.getContextPath()%>/style/styles.css" rel="stylesheet" >
</head>
<body>
<header>
  <nav class="navbar navbar-default">
      <a class="navbar-brand" href="">Open Cart</a>
      <div class="navbar-header">
        <ul class="nav navbar-nav">
      
      <c:forEach var="category" items="${categories}">
         <li class="dropdown"> <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> ${category.category} <span class="caret"></span></a>
          <ul class="dropdown-menu">
          <c:forEach var="sub" items="${category.subCategories}">
           <li> <a href="/OpenCart/subcategory?id=${sub.id}"> ${sub.subCategory}</a> </li>
          </c:forEach>
      
         
        </ul>
         </li>
         </c:forEach>
      </div>
      
  </nav>
</header>