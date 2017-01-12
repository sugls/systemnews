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
                    <tr tdstyle>
                    	<td><input type="checkbox" name="newslist" value="1"></td>
                        <td>标题1</td>
                        <td>国际新闻</td>
                        <td>2016-06-05</td>
                        <td>作者一</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="newslist" value="2"></td>
                        <td>标题1</td>
                        <td>国际新闻</td>
                        <td>2016-06-05</td>
                        <td>作者一</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="newslist" value="3"></td>
                        <td>标题1</td>
                        <td>国际新闻</td>
                        <td>2016-06-05</td>
                        <td>作者一</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="newslist" value="4"></td>
                        <td>标题1</td>
                        <td>国际新闻</td>
                        <td>2016-06-05</td>
                        <td>作者一</td>
                    </tr>
                    <tr>
                    	<td><input type="checkbox" name="newslist" value="5"></td>
                        <td>标题1</td>
                        <td>国际新闻</td>
                        <td>2016-06-05</td>
                        <td>作者一</td>
                    </tr>
                </table>
                <div class="tablestyle1" style="text-align:right"><input type="button" value="删除"></div>
                <div class="tablestyle1" style="height:20px"><input type="button" value="上一页">
                &nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="下一页">&nbsp;&nbsp;&nbsp;&nbsp;<label class="font3">1/5</label></div>
             </td>
        </tr>
    </table>

</body>
</html>
