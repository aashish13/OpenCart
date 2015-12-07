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
                <h3>Add Products Here </h3>
                <sf:form action="/OpenCart/admin/product/add" method="Post" commandName="product">
                    
                    <table>
                            <sf:hidden path="id" />
                            
                            <tr>
                                <td>Product Name</td>
                                <td>
                                    <sf:input path="name" ></sf:input>
                                </td>
                                <td>
                                    <sf:errors path="name" cssClass="error" ></sf:errors>
                                </td>
                            </tr>
                            <tr>
                                <td>Price</td>
                                <td>
                                    <sf:input path="price" ></sf:input>
                                </td>
                                <td>
                                    <sf:errors path="price" cssClass="error" ></sf:errors>
                                </td>
                            </tr>
                            <tr>
                                <td>Details </td>
                                <td>
                                    <sf:input path="details" ></sf:input>
                                </td>
                                <td>
                                    <sf:errors path="details" cssClass="error" ></sf:errors>
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    Sub Category
                                </td>
                                <td>
                                    <sf:select path="subCategory">
                                        <sf:option value="" label="--- Select ---"/>
                                        <sf:options title="Select Category" items="${subCategories}" itemLabel="subCategory" itemValue="id"  />
                                    </sf:select>
                                    
                                </td>
                                <td>
                                    <sf:errors path="subCategory" cssClass="error" ></sf:errors>
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
