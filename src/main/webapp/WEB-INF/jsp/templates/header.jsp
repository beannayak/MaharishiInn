<%-- 
    Document   : header
    Created on : May 5, 2015, 10:06:00 PM
    Author     : sajana
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value='/resources/css/pricing.css' />" rel="stylesheet">
        <link href="<c:url value='/resources/css/pricing-old-ie.css' />" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/grids-responsive-min.css">

    </head>
    <body>
        <div class="pure-menu pure-menu-horizontal">
            <ul class="pure-menu-list">
                <c:url var="destination" value="/destination/" />
                <li class="pure-menu-item"><a href="" class="pure-menu-heading">About Us</a></li>
                    <c:url var="destination" value="/destination/listAll" />
                <li class="pure-menu-item"><a href="${destination}" class="pure-menu-link">Contact Us</a></li>
                    <c:url var="adventure" value="/adventure/listAll" />
                <li class="pure-menu-item pure-menu-selected"><a href="${adventure}" class="pure-menu-link">All Rooms</a></li>
                <li class="pure-menu-item"><a href="#" class="pure-menu-link">Contact</a></li>
                    <c:url var="region" value="/region/listAll" />
                <li class="pure-menu-item pure-menu-selected"><a href="${region}" class="pure-menu-link">Reserve</a></li>
                    <c:url var="login" value="/login" />
                <li class="pure-menu-item pure-menu-selected"><a href="${login}" class="pure-menu-link">login</a></li>
            </ul>
        </div>
    </body>
</html>
