<%-- 
    Document   : home
    Created on : Feb 17, 2019, 3:14:30 PM
    Author     : bretthanson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href=""${pageCOntext.request.contextPath}/css/bootstrap.min.css"
              rel="stylesheet">
              <link rel="shortcut icon"
              href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Company Contact</h1>
            <hr/>
            <div class="navbar">
                <ul class=" nav nav-tabs">
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/home">Home</a>                      
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/search">Search</a>                      
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>                      
                    </li>
                </ul>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h2>My Contacts</h2>
                    <table id="contactTable" class="table table-hover">
                        <tr>
                            <th width="40%">Contact Name</th>
                            <th width="30%">Company</th>
                            <th width="15%"></th>
                            <th width="15%"></th>
                        </tr>
                        <tbody id="contentRows"></tbody> </table>
                </div>
                <div class="col-md-6">
                    <h2>Add New Contact</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-first-name" class="col-md-4 control-label">
                                   First Name:
                                   </label>
                                   <div class="col-md-8">
                                   <input type="text" 
                                          class="form-control"
                                          id="add-first-name"
                                          placeholder="First Name"/>
                                  </div> 
                         </div>
                         <div class="form-group">
                             <label for="add-last-name" class="col-md-4 control-label">
                                    Last Name:
                             </label>
                                    <div class="col-md-8">
                                    <input type="text" 
                                           class="form-control"
                                           id="add-last-name"
                                           placeholder="Last Name"/>
                                     </div> 
                         </div>
                         <div class="form-group">
                             <label for="add-company" class="col-md-4 control-label">
                                    Company:
                             </label>
                                    <div class="col-md-8">
                                    <input type="text" 
                                           class="form-control"
                                           id="add-company"
                                           placeholder="Company"/>
                                     </div> 
                         </div>
                         <div class="form-group">
                             <label for="add-email" class="col-md-4 control-label">
                                    Email:
                             </label>
                                    <div class="col-md-8">
                                    <input type="text" 
                                           class="form-control"
                                           id="add-email"
                                           placeholder="Email"/>
                                     </div> 
                         </div>
                         <div class="form-group">
                             <label for="add-phone" class="col-md-4 control-label">
                                    Phone:
                             </label>
                                    <div class="col-md-8">
                                    <input type="text" 
                                           class="form-control"
                                           id="add-phone"
                                           placeholder="Phone"/>
                                     </div> 
                         </div>
                        <div class="form-group">
                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-8">
                                    <button type="submit"
                                            id="add-button"
                                            class="btn btn-default">
                                        Create Contact
                                    </button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
