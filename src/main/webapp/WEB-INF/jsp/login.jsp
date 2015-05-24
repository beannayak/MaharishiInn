<%-- 
    Document   : login
    Created on : May 17, 2015, 6:49:21 PM
    Author     : sajana
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <%@include file="templates/header.jsp"%>
    </head>
    <body>
        <h1>Login!</h1>
        <section>
            <div class="dataList">
                <c:url var="actionUrl" value='j_spring_security_check' />
                <form method="post" action="${actionUrl }" class="pure-form pure-form-aligned">

                    <fieldset>
                        <legend></legend>

                        <div class="pure-control-group">
                            <label for="userName">Username</label>
                            <input type="text" name="j_username" />
                        </div>
                        <div class="pure-control-group">
                            <label for="password">Password</label>
                            <input type="password"  name="j_password" />
                        </div>
                        <input type="submit" value="Login"/>
                    </fieldset>
                </form>
            </div>
        </section>

        <div class="modal-footer">
            <div class="col-md-12">
                <span class="pull-left"><a href="#">Forgot Password?</a></span> <span><a
                        href="#">Register</a></span>
            </div>
        </div>
        <%@include file="templates/footer.jsp"%>
    </body>

</html>
