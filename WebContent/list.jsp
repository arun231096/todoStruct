<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
    <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDo</title>
</head>
<body>
    <logic:iterate name="formlist" id="todo">
        <p>
            List Users <bean:write name="todo" property="title"/> <br>
        </p>
    </logic:iterate>
</body>
</html>