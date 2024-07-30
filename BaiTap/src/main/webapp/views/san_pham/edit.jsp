<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/8/2024
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="POST" action="/BTVN_war_exploded/san_pham/update">
    <div>
        <label>Mã</label>
        <input type="text" name="ma" value="${sp.ma}"/>
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${sp.ten}"/>
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1"
        ${sp.trangThai == 1? "checked":""} />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0"
        ${sp.trangThai == 0? "checked":""}  />
        <label>Ngừng hoạt động</label>
    </div>
    <div>
        <button>Cập nhật</button>
    </div>
</form>

</body>
</html>
