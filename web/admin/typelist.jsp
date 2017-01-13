<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新闻模块管理系统</title>
<link href="style.css" rel="stylesheet" type="text/css">
    <script src="js/news.js" type="text/javascript"></script>
</head>

<body>
	<br><br>
	<table class="tablestyle1 font1 styleC">
    	<tr height="200px">
        	<td colspan="2" class="tdstyle1">新闻模块管理系统</td>
        </tr>     
        <tr height="500px">
        	<td class="styleT tdstyle2">
                <%@ include file="menu.jsp" %>
            </td>
            <td class="styleT tdstyle3">
            	<div class="font3 marginT20">类别列表</div>
                <br>
                <div class="font9">${info}</div>
            	<table class="tablestyle3 font3 styleC">
                      <tr height="30" class="font6">
                        <td class="tdstyle">类别名称</td>
                        <td colspan="2" class="styleC tdstyle">操作</td>                   
                      </tr>
                    <c:forEach items="${types}" var="type" varStatus="status">
                      <tr height="30" <c:choose><c:when test="${status.index%2==0}"> class="font7"</c:when><c:otherwise>class="font8"</c:otherwise></c:choose>>
                        <td class="tdstyle">${type.typename}</td>
                          <td class="tdstyle"><a href="type?option=onetype&id=${type.typeid}">修改</a></td>
                        <td class="tdstyle"><a href="type?option=deltype&id=${type.typeid}" onclick="checkDel('确定需要删除类别吗？')">删除</a></td>
                      </tr>
                    </c:forEach>
                </table>
             </td>
        </tr>
    </table>

</body>
</html>
