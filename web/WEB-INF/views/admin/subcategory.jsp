<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%-- 
    Document   : subcategory
    Created on : 5-Dec-2015, 7:39:42 PM
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

                    
                            <a href="/OpenCart/admin/subcategory?action=add" class="btn btn-large btn-info">
                                <i class="glyphicon glyphicon-plus"></i> &nbsp; Add Sub Category</a><br/><br/>
                            <table class="table table-hover">
                                <tr>
                                    <th>#</th>
                                    <th>Category</th>
                                    <th>Sub Category</th>
                                    <th>Action</th>
                                </tr>

                                <c:forEach var="sub" items="${subcategory}">
                                    <tr>
                                        <td>${sub.id}</td>
                                        <td>${sub.category.category}</td>
                                        <td>${sub.subCategory}</td>

                                        <td>    
                                            <a href="subcategory?action=delete&id=${sub.id}" class="btn btn-danger">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                       
                       
                    


                    
             


        </div>
    </div>
</div>
</div>
</body>
</html>
