<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>springMVC的项目</p>
    <p><a href="some.do">发起some.do请求</a> </p>
    <form action="first.do" method="get">
        <input type="submit" value="get请求first.do">
    </form>
    <br/>
    <form action="other.do" method="post">
        <input type="submit" value="post请求other.do">
    </form>
    <br/>
    <p>提交参数给controller</p>
    <form action="receiveProperty.do">
        receiveProperty.do<br/>
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>

    <form action="receiveTest.do">
        receiveTest.do<br/>
        姓名：<input type="text" name="sname"><br/>
        年龄：<input type="text" name="sage"><br/>
        <input type="submit" value="提交参数">
    </form>

    <form action="receiveObject.do" method="post">
        receiveObject.do<br/>
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>
</body>
</html>
