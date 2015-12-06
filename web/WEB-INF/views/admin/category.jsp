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
                    
                            <h3>View All Categories Here:-</h3>
                            <a href="/OpenCart/admin/category/add" class="btn btn-large btn-info">
                                <i class="glyphicon glyphicon-plus"></i> &nbsp; Add Category</a><br/><br/>
                            <table class="table table-hover">
                                <tr>
                                    <th>#</th>
                                    <th>Category</th>
                                </tr>
                                <c:forEach var="category" items="${categories}">
                                    <tr>
                                        <td><c:out value="${category.id}" /></td>
                                        <td>${category.category}</td>
                                        <td>
                                            <a href="/OpenCart/admin/category/delete?id=${category.id}" class="btn btn-danger">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        
                </div>
            </div>
        </div>
    </div>
</body>
</html>