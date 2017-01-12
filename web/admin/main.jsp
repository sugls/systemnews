<%@ page import="com.hzgg.systemnews.adminmanage.vo.Admins" %>
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
            
            	<table class="styleT tablestyle2">
                	<tr height="500px">
                    	<td class="styleT">
                        <div class="font2 styleC">
                			${admin.realname},欢迎使用本系统。
               			</div>
                        </td>
                    </tr>
                </table>
            	
             </td>
        </tr>
    </table>

</body>
</html>
