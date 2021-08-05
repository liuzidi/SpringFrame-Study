<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%--输出,条件,迭代标签库--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <%--数据格式化标签库--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <%--数据库相关标签库--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <%--常用函数标签库--%>
<%@ page isELIgnored="false"%> <%--支持EL表达式--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>show.jsp</h3>
    <h3>msg:${msg}</h3>
    <h3>fun:${fun}</h3>
    <h2>myname:${myname}</h2>
    <h2>myage:${myage}</h2>
</body>

</html>
