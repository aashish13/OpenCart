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

                    <form:form method="POST" action="viewall">

                        <%
                            if (request.getParameter("action").equals("viewall")) {
                        %>
                        <table class="table table-hover">
                            <tr>
                                <th>#</th>
                                <th>Key</th>

                                <th>Value</th>
                                <th>Action</th>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><a href="appconf?action=edit" class="btn btn-warning">Edit</a>
                                    <a href="#" class="btn btn-danger">Delete</a></td>
                            </tr>
                        </table>
                    </form:form>
                    <a href="appconf?action=add" class="btn btn-large btn-info"><i class="glyphicon glyphicon-plus"></i> &nbsp; Add Records</a>

                    <form:form method="POST" action="edit" class="form-horizontal">
                        <%} else if (request.getParameter("action").equals("edit")) {

                            
                        %>
                        <table>
                            <tr>
                            <div class="form-group">
                                <label for="key" class="col-sm-2 control-label">Key</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="key" placeholder="Key">
                                </div>
                            </div></br></tr>
                            <tr>
                            <div class="form-group">
                                <label for="value" class="col-sm-2 control-label">Value</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="value" placeholder="value">
                                </div>
                            </div></br>
                            </tr>
                            <tr>
                            <div class="form-group">
                                <label for="createdat" class="col-sm-2 control-label">Created At</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="createdat" placeholder="Created At">
                                </div>
                            </div>

                            </div></br>
                        </tr><tr>                        <div class="form-group">
                        <label for="updatedat" class="col-sm-2 control-label">Updated At</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="updatedat" placeholder="Updated At">
                        </div>
                    </div>
                    </div>
                    </tr>
            </form:form>
            </br></br></br></br><tr>
            <button type="button" class="btn btn-warning">Edit</button>
            </tr>
            </table>
                        
<form:form method="POST" action="add" class="form-horizontal">
            <%}
            else if (request.getParameter("action").equals("add")) {

                            
                        %>
           <table>
                            <tr>
                            <div class="form-group">
                                <label for="key" class="col-sm-2 control-label">Key</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="key" placeholder="Key">
                                </div>
                            </div></br></tr>
                            <tr>
                            <div class="form-group">
                                <label for="value" class="col-sm-2 control-label">Value</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="value" placeholder="value">
                                </div>
                            </div></br>
                            </tr>
                            <tr>
                            <div class="form-group">
                                <label for="createdat" class="col-sm-2 control-label">Created At</label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control" id="createdat" placeholder="Created At">
                                </div>
                            </div>

                            </div></br>
                        </tr><tr>                        <div class="form-group">
                        <label for="updatedat" class="col-sm-2 control-label">Updated At</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="updatedat" placeholder="Updated At">
                        </div>
                    </div>
                    </div>
                    </tr>
            </form:form>
            </br></br></br></br><tr>
            <button type="button" class="btn btn-large btn-info"><i class="glyphicon glyphicon-plus"></i> &nbsp; Add Records</a>
            </tr>
            </table>
</form:form> 
            <%}%>
            
            
            
            
        </div>
    </div>
</div>
</div>
</body>
</html>