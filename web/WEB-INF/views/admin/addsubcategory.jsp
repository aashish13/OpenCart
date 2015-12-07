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
                <h3>Add Sub Category Here </h3>
                <sf:form action="/OpenCart/admin/subcategory/add" method="Post" commandName="subCategory">
                    
                    <table>
                            <sf:hidden path="id" />
                            <tr>
                                <td>Sub Category</td>
                                <td>
                                    <sf:input path="subCategory" ></sf:input>
                                </td>
                                <td>
                                    <sf:errors path="subCategory" cssClass="error" ></sf:errors>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Category
                                </td>
                                <td>
                                    <sf:select path="category">
                                        <sf:option value="" label="--- Select ---"/>
                                        <sf:options title="Select Category" items="${categories}" itemLabel="category" itemValue="id"  />
                                    </sf:select>
                                    
                                </td>
                                <td>
                                    <sf:errors path="category" cssClass="error" ></sf:errors>
                                </td>

                            </tr>
                            <tr><td></td><td></td></tr>
                            <tr><td></td><td></td></tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="submit" value="Add " class=" btn-sm btn-info" />
                                </td>
                            </tr>
                            </table>
                </sf:form>
            </div>
        </div>
</html>
