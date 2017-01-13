<%@ page pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新闻模块管理系统</title>
<link href="style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/news.js"></script>
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
                <form action="type" method="post" onsubmit="return checkSubmit()">
                    ${info}<br>
                    <input type="hidden" name="option" value="addtype">
            	<div class="font2 marginT20">类别添加</div>
            	<span class="spanR marginT20">类别名称：</span><span class="spanL"><input type="text" id="typename" name="typename" class="inputw20"></span>
                <span class="spanR"></span><span class="spanL marginT20"><input type="submit" name="" value="确认">&nbsp;&nbsp;<input type="reset" value="重置" name=""></span>
                </form>
            </td>
        </tr>
    </table>

</body>
</html>
