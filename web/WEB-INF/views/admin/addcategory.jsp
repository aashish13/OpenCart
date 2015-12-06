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


                    <h3>Add Categories Here :-</h3>
                    <sf:form method="post" action="/OpenCart/admin/category/add" commandName="category">
                        <table>
                            <sf:hidden path="id" />
                            <tr>
                                <td>Category</td>
                                <td><sf:input path="category" id="category" ></sf:input></td>
                                <td><sf:errors path="category" cssClass="error" ></sf:errors></td>
                                </tr>
                                <tr>
                                    <td>
                                        <input type="submit" value="Add " class=" btn-sm btn-info" />
                                    </td>
                                </tr>
                            </table>
                    </sf:form>

                </div>
            </div>
        </div>
    </div>
</body>
</html>


