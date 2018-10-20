<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>TODOLIST</title>
    <c:import url="../settings/headsettings.jsp"></c:import>
</head>
<body>
<div class="container main-div mt-md-5">
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-warning ml-2" href="/filiation/create">Create</a>
    </div>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
                <th colspan="2"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${table}" var="item">
                <tr>
                    <th scope="row">${item.id}</th>
                    <td scope="row">${item.name}</td>
                    <td scope="row">${item.datecreate}</td>
                    <td colspan="2">
                     <%--   <a href="/schedules">
                            <button class="btn btn-outline-info m-2" name="id" type="submit" value="${item.id}">Schedule
                            </button>
                        </a> --%>
                        <a href="/filiation/${item.id}">
                            <button class="btn btn-outline-info m-2" name="id" type="submit" value="${item.id}">Edit
                            </button>
                        </a>
                        <button class="btn btn-outline-danger m-2 del" type="submit" value="${item.id}">
                            Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
