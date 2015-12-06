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
                <h3>Add Sub Category Here :-</h3>
                <sf:form method="POST"  commmandName="subcategory" action="/OpenCart/admin/subcategory/add" class="form-horizontal" action="/OpenCart/admin/subcategory/add">
                    <table>
                        <tr>
                        <div class="form-group">
                            <label for="category" class="col-sm-2 control-label">Category</label>
                            <div class="col-sm-3">
                                <sf:select path="categories" cssClass="form-control">
                                    <sf:options items="${categories}" itemValue="id" itemLabel="category" />
                                </sf:select>

                            </div>
                        </div></br></tr>
                        <tr>
                        <div class="form-group">
                            <label for="subcategory" class="col-sm-2 control-label">Sub Category</label>
                            <div class="col-sm-2">
                                <sf:input path="subcategory" id="subcategory" ></sf:input>
                                <sf:errors path="subcategory" cssClass="error" ></sf:errors>

                                </div>
                            </div>
                            </tr>                        
                                <button type="submit" value="add" class="btn btn-large btn-info"><i class="glyphicon glyphicon-plus"></i> &nbsp; Add Records</a>
                            <tr>
                            </sf:form>
                            </table>
                        </br></br></br></br><tr>
                        </tr>
                        <!--                            </table>-->


                        </html>
