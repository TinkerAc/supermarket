<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./login.css">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <title>登录界面</title>
</head>
<script>
	function clc(){
		document.getElementById("name").value="";
		document.getElementById("password").value="";
        }//登录账号重置--清除
</script>
<body>
   <form action="action/LoginServlet" method="post" class="user">
   <div class="jumbotron" style="background-color:#aaaaaa;magin:0px;height:100%">
    <!--<font style="font-size:30px">超市账户登录</font>-->
    <div id="container">
        <div id="background">
            <div id="login">用户登录</div>
            <div class="frame">
               <div class="input-group">
                    <span class="input-group-addon">账号</span>
                    <input type="text" name="username" class="form-control" placeholder="用户账号">
               </div>   
            </div>
            <div class="frame">
                <div class="input-group">
                <span class="input-group-addon">密码</span>
                <input type="password" name="password" class="form-control" placeholder="密码">
      </div>   
            </div> 
            <button type="submit" class="btn btn-warning">登录</button>
            <button type="button" class="btn btn-warning" onclick="clc()">取消</button>
            <div id="in"><a href="enroll.html" style="text-decoration: none;color:red;">用户注册</a></div>
        </div>
       
    </div>
   </div>
   </form>
</body>
</html>