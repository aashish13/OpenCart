<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%-- 
    Document   : addsubcategory
    Created on : 6-Dec-2015, 12:29:29 AM
    Author     : esha
--%>


<!DOCTYPE html>
<html>
    <div class="container" style="margin:auto;">
        <!-- Including header -->
        <jsp:include page="header.jsp" />
        <div class="row clearfix">
            <!-- Including side bar -->
            <jsp:include page="sidebar.jsp" />
            <div class="col-lg-9">
                <div  class="row">
                </div>
                <h3>Add Products Image Here </h3>
                <form method="post" enctype="multipart/form-data" action="/OpenCart/admin/product/upload">
                    File to upload:   <input type="file" name="file" accept="image/*">
                    <input type="hidden" value="${id}" name="id">
                    <input type="submit" value="Upload"> 
                </form>
            </div>
        </div>
</html>
