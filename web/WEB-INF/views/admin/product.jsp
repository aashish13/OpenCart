<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%-- 
    Document   : app_config.jsp
    Created on : Dec 3, 2015, 4:24:25 PM
    Author     : Aashish
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

                    <a href="/OpenCart/admin/product/add" class="btn btn-large btn-info">
                        <i class="glyphicon glyphicon-plus"></i> &nbsp; Add Products</a><br/><br/>
                    <table class="table table-hover">
                        <tr>
                            <th>#</th>
                            <th>Detail</th>
                            <th>Name </th>
                            <th>Sub Category</th>
                            <th>Category</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach var="product" items="${products}">
                            <tr>
                                <td><c:out value="${product.id}" /></td>
                                <td>${product.details}</td>
                                <td>${product.name}</td>
                                <td>${product.subCategory.subCategory}</td>
                                <td>${product.subCategory.category.category}</td>
                                <td>
                                    <a href="/OpenCart/admin/product/delete?id=${product.id}" class="btn btn-danger">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>