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
                    <a href="appconf?action=add" class="btn btn-large btn-info"><i class="glyphicon glyphicon-plus"></i> &nbsp; Add Records</a><br/><br/>

                    <c:choose>
                        <c:when test="${param.action eq 'viewall'}">
                            <table class="table table-hover">
                                <tr>
                                    <th>#</th>
                                    <th>Detail</th>

                                    <th>Name </th>
                                    <th>SubCategory</th>
                                    <th>Action</th>
                                </tr>

                                <c:forEach var="product" items="${products}">
                                    <tr>
                                        <td><c:out value="${product.product_id}" /></td>
                                        <td>${product.details}</td>
                                        <td>${product.name}</td>
                                        <td>${product.subCategory.subCategory}</td>
                                        <td><a href="products?action=edit&id=${product.product_id}" class="btn btn-warning">Edit</a>
                                            <a href="products?action=delete&id=${product.product_id}" class="btn btn-danger">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:when>
                        <c:when test="${param.action eq 'edit'}">

                        </c:when>
                        <c:when test="${param.action eq 'add'}">
                            <sf:form>
                        </c:when>
                    </c:choose>


                </div>
            </div>
        </div>
    </div>
</body>
</html>