<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sinh viên</title>
</head>
<body>
    <h2>Danh sách sinh viên</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Mã SV</th>
            <th>Họ và tên</th>
            <th>Email</th>
            <th>Số ĐT</th>
        </tr>
        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.id}</td>
                <td>${s.maSV}</td>
                <td>${s.ho} ${s.tenLot} ${s.ten}</td>
                <td>${s.email}</td>
                <td>${s.soDT}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>