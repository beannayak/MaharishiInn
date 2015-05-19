<%-- 
    Document   : signup
    Created on : May 18, 2015, 5:37:04 PM
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
        <h1>Sign Up</h1>
        <section>
            <div class="dataList">
                <c:url var="actionUrl" value="signup" />
                <form:form id="signupForm" commandName="userInformation" method="post"
                           action="${actionUrl }" class="pure-form pure-form-aligned">

                    <fieldset>
                        <legend></legend>
                        <div class="pure-control-group">
                            <label for="firstName">First Name</label>
                            <form:input path="firstName" placeholder="First Name" />
                        </div>
                        <div class="pure-control-group">
                            <label for="lastName">Last Name</label>
                            <form:input  path="lastName"  placeholder="Last Name" />
                        </div>
                        <div class="pure-control-group">
                            <label for="email">Email</label>
                            <form:input path="emailId" placeholder="Email" />
                        </div>
                        <div class="pure-control-group">
                            <label for="contactNo">Contact No#</label>
                            <form:input  path="contactNo"  placeholder="Contact No" />
                        </div>
                        <div class="pure-control-group">
                            <label for="city">City</label>
                            <form:input path="city" placeholder="City" />
                        </div>
                        <div class="pure-control-group">
                            <label for="state">State</label>
                            <form:input  path="state"  placeholder="State" />
                        </div>
                        <input type="submit" value="Sign Up"/>
                    </fieldset>
                </form:form>
            </div>
        </section>
        <%@include file="templates/footer.jsp"%>
    </body>
</html>
