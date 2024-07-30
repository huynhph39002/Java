<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>
<form method="post" action="/dong-vat/add">
    ma:<input name="ma" type="text">
    khu vuc:
    <select name="khuVuc">
        <option disabled>--lua chon--</option>
        <option value="ha noi">ha noi</option>
        <option value="bac giang">bac giang</option>
    </select>

    ten:<input name="ten" type="text">
    can nang:<input name="canNang" type="text">
    gioi tinh
    <input name="gioiTinh" value="true" checked>hoat dong
    <input name="gioiTinh" value="false" >khong hoat dong

<button type="submit">add</button>

</form>

</body>
</html>