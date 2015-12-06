<%-- 
    Document   : promotion.jsp
    Created on : 5 Dec, 2015, 8:48:25 PM
    Author     : Bangalore-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <a href="promotion?action=add" class="btn btn-large btn-info">
                                <i class="glyphicon glyphicon-plus"></i> &nbsp; Add Promotions</a><br/><br/>
                            <table class="table table-hover">
                                <tr>
                                    <th>#</th>
                                    <th>Detail</th>

                                    <th>Name </th>
                                    <th>SubCategory</th>
                                    <th>Action</th>
                                </tr>

                                <c:forEach var="promotion" items="${promotions}">
                                    <tr>
                                        <td><c:out value="${promotion.promotion_id}" /></td>
                                        <td>${promotion.description}</td>
                                        <td>${promotion.product}</td>
                                        <td><a href="promotions?action=edit&id=${promotion.promotion_id}" class="btn btn-warning">Edit</a>
                                            <a href="promotions?action=delete&id=${promotion.promotion_id}" class="btn btn-danger">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:when>
                        <c:when test="${param.action eq 'edit'}">

                        </c:when>
                        <c:when test="${param.action eq 'add'}">
                            <h1>Add Promotions Here :-</h1>
                        </c:when>
                    </c:choose>


                </div>
            </div>
        </div>
    </div>
</body>
</html>
