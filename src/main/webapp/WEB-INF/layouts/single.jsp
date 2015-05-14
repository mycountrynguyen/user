<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:putAttribute name="title"/></title>
        <tilesx:useAttribute id="list" name="css" classname="java.util.List" />
        <c:forEach var="file" items="${list}">
            <link type="text/css" rel="stylesheet" href="${file}"/>
        </c:forEach>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    </head>

    <body>
        <tiles:insertAttribute name="body"/>
        <tilesx:useAttribute id="list" name="js" classname="java.util.List" />
        <c:forEach var="file" items="${list}">
            <script type="text/javascript" src="${file}"></script>
        </c:forEach>
    </body>
</html>