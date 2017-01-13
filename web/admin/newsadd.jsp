<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            	<div class="font3 marginT20">新闻添加</div>
                <div id="tdmain" class="tablestyle1 font3">
                	<span class="spanR">新闻标题：</span><span class="spanL"><input type="text" size="20" class="inputw20"></span><br>
                    <span class="spanR">新闻类别：</span><span class="spanL"><select name="newstype" >
                    		<option value="0">---请选择---</option>
                            <c:forEach items="${types}" var="type">
                                <option value="${type.typeid}">${type.typename}</option>
                            </c:forEach>
                    		</select></span><br>
                    <span class="spanR">新闻类容：</span><span class="spanL"><textarea cols="25" rows="5" class="areaW200"></textarea></span><br>
                    <span class="spanR">新闻作者：</span><span class="spanL"><input type="text" size="20" class="inputw20"></span><br>
                    <span class="spanR">关键字：</span><span class="spanL"><input type="text" size="20" class="inputw20"></span><br>
                    <span class="spanR">&nbsp;</span><span class="spanL"><input type="reset" value="重置">&nbsp;&nbsp;<input type="submit" value="确定"></span>    
                </div>
             </td>
        </tr>
    </table>

</body>
</html>
