<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2024
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="POST" action="/create" >
    <div>
        <label>ma:</label>
        <input type="text" name="ma">
    </div>
    <div>
        <label>ten:</label>
        <input type="text" name="ten">
    </div>
    <div>
        <label>trangThai:</label>
        <input type="radio" name="trangThai" value="1" checked>
        <label>hoat dong</label>
        <input type="radio" name="trangThai" value="0" >
        <label> khong hoat dong</label>
    </div>

    <div>
        <button>Them</button>
    </div>
</form>

</body>
</html>
