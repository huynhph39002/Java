<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 22/01/2023
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/thuc-vat/update?${s.id}" method="post">
    id: <input type="text" name="id" value="${s.id}"  />
    <br/>
    loai: <input type="text" name="loai" value="${s.loai}"  />
    <br/>
    Tên: <input type="text" name="ten" value="${s.ten}" />
    <br/>
    Tuổi: <input type="text" name="tuoi"value="${s.tuoi}" />
    <br/>
   khu vuc: <input type="text" name="khuVuc"value="${s.khuVuc}" />
    <br/>
   gioiTInh:
     <input type="radio" name="gioiTinh" value="true"${s.gioiTinh ? 'checked':''} />nam
        <input type="radio" name="gioiTinh" value="false" ${!s.gioiTinh ? 'checked':''}/>nu

    <br/>
    <button type="submit">Update</button>
</form>

</body>
</html>
