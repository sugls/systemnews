<%@ page pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新闻模块管理系统</title>
<style type="text/css">
	#main{width:400px;height:200px; margin:50px auto; border:#09F 1px solid;}
	#title{ font-size:20px; color:#09F}
</style>
<link rel="stylesheet" type="text/css" href="style.css">
<script type="text/javascript">
    function checkLogin() {
        if (document.getElementById("username").value==""){
            alert("用户名不能为空");
            document.getElementById("username").focus();
            return false
        }else if (document.getElementById("password").value==""){
            alert("密码不能为空");
            document.getElementById("password").focus();
            return false;
        }else {
            return true;
        }
    }
</script>
</head>

<body>
	
    <div id="main">
    
    	<h2 align="center" id="title">新闻模块管理登录</h2>
        <form action="login" method="post" onsubmit="return checkLogin()">
        <span class="spanR"></span><span class="spanL">${error}</span><br>
        <span class="spanR">用户名：</span><span class="spanL"><input type="text" name="username" size="20" id="username" style="width: 180px"></span><br><br>
            <span class="spanR">密&nbsp;码：</span><span class="spanL"><input type="password" id="password" name="passwd" size="20" style="width: 180px"></span><br><br>
            <span class="spanC"><input type="submit" value="登录">&nbsp;&nbsp;<input type="reset" value="重置"></span>
        </form>
    
    </div>

</body>
</html>
