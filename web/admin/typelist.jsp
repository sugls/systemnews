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
            	<table class="tablestyle3 font3 styleC">
                      <tr height="30" class="font6">
                        <td class="tdstyle">类别名称</td>
                        <td colspan="2" class="styleC tdstyle">操作</td>                   
                      </tr>
                      <tr height="30" class="font7">
                        <td class="tdstyle">国内新闻</td>
                        <td class="tdstyle">修改</td>
                        <td class="tdstyle">删除</td>
                      </tr>
                      <tr height="30" class="font8">
                        <td class="tdstyle">国际新闻</td>
                        <td class="tdstyle"><a href="" class="font2">修改</a></td>
                        <td class="tdstyle"><a href="">删除</a></td>
                      </tr>
                      <tr height="30" class="font7">
                        <td class="tdstyle">娱乐新闻</td>
                        <td class="tdstyle">修改</td>
                        <td class="tdstyle">删除</td>
                      </tr>
                      <tr height="30" class="font8">
                        <td class="tdstyle">体育新闻</td>
                        <td class="tdstyle">修改</td>
                        <td class="tdstyle">删除</td>
                      </tr>
                    </table>
             </td>
        </tr>
    </table>

</body>
</html>
