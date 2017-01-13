<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新闻模块管理系统</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>

<body>
	<br><br>
	<table class="tablestyle1 styleC">
    	<tr height="200px">
        	<td colspan="2" class="tdstyle1 font1">新闻模块管理系统</td>
        </tr>     
        <tr height="500px">
        	<td class="styleT tdstyle2">
                <%@ include file="menu.jsp" %>
            </td>
            <td class="styleT tdstyle3">
            	<div class="font3 marginT20">新闻列表</div><br>
                <table class="tablestyle3 font2">
                	<tr tdstyle>
                    	<td></td>
                        <td>新闻标题</td>
                        <td>新闻类别</td>
                        <td>发布日期</td>
                        <td>作者</td>
                    </tr>
                    <c:forEach items="${newss}" var="news">
                    <tr tdstyle>
                    	<td><input type="checkbox" name="id" value="${news.newsid}"></td>
                        <td><a href="news?option=onenews&id=${news.newsid}">${news.title}</a> </td>
                        <td>${news.typename}</td>
                        <td>${news.createdate}</td>
                        <td>${news.author}</td>
                    </tr>
                    </c:forEach>

                </table>
                <div class="tablestyle1" style="text-align:right"><input type="button" value="删除"></div>
                <div class="tablestyle1" style="height:20px"><a href="news?option=shownews&pages=${pages-1}"><input type="button" value="上一页" ></a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a href="news?option=shownews&pages=${pages+1}"><input type="button" value="下一页"></a>&nbsp;&nbsp;&nbsp;&nbsp;<label class="font3">${pages}/${totalpages}</label></div>
             </td>
        </tr>
    </table>

</body>
</html>
