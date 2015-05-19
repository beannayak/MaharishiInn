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
                <c:url var="actionUrl" value="login" />
                <form:form id="loginForm" commandName="user" method="post"
                           action="${actionUrl }" class="pure-form pure-form-aligned">

                    <fieldset>
                        <legend></legend>

                        <div class="pure-control-group">
                            <label for="userName">Username</label>
                            <form:input path="userName" placeholder="User Name" />
                        </div>
                        <div class="pure-control-group">
                            <label for="password">Password</label>
                            <form:input  path="password"  placeholder="Password" />
                        </div>
                        <input type="submit" value="Login"/>
                    </fieldset>
                </form:form>
            </div>
        </section>

        <%@include file="templates/footer.jsp"%>
    </body>

</html>
