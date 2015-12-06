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
                    <c:choose>
                        <c:when test="${param.action eq 'viewall'}">
                            <h3>View All Categories Here:-</h3>
                            <a href="products?action=add" class="btn btn-large btn-info">
                                <i class="glyphicon glyphicon-plus"></i> &nbsp; Add Products aas ${categories}</a><br/><br/>
                            <table class="table table-hover">
                                <tr>
                                    <th>#</th>
                                    <th>Category</th>
                                </tr>
                                <c:forEach var="category" items="${categories}">
                                    <tr>
                                        <td><c:out value="${category.id}" /></td>
                                        <td>${category.category}</td>
                                        <td><a href="/OpenCart/admin/category?action=edit&id=${category.id}" class="btn btn-warning">Edit</a>
                                            <a href="/OpenCart/admin/category?action=edit&id=${category.id}" class="btn btn-danger">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:when>
                        <c:when test="${param.action eq 'edit'}">
                            <h3>Edit Categories Here :-</h3>
                        </c:when>
                        <c:when test="${param.action eq 'add'}">
                            <h3>Add Categories Here :-</h3>
                            <sf:form method="post" action="/OpenCart/admin/category?action=add" commandName="category">
                                <table>
                                    <sf:hidden path="id" />
                                    <tr>
                                        <td>Category</td>
                                        <td><sf:input path="category" id="category" ></sf:input></td>
                                        <td><sf:errors path="category" cssClass="error" ></sf:errors></td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="submit" value="Add Category" class=" btn-sm btn-info" />
                                        </td>
                                    </tr>
                                    </table>
                            </sf:form>
                        </c:when>
                        <c:when test="${param.action eq 'delete'}">
                            <h3>Category Deleted :-</h3>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</body>
</html>