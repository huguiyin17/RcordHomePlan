<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
  
      <!-- 新 Bootstrap4 核心 CSS 文件 -->
      <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
 
     <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
     <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
 
     <!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
     <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
 
     <!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
     <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
     <style type="text/css">
     	   body{
     	   width:1500px;
        	position: relative;
        }
     
     	#loginDiv{
    		width:400px;
    		height:400px;
            position: absolute; 
            top: 50%; /*偏移*/
            right:200px;
            transform:translateY(-50%);
            border-radius:10px;
            border:1px solid #000000;
            padding-left:40px;
            padding-top:70px;
            padding-bottom:20px;
            
        }
        
       	img{
       		margin-top:-50px;
       		width:800px;
       	}
       	
       	.login{
       		width:120px;
       	}
     	.register{
     		margin-left:20px;
     		width:120px;
     	}
     	
		.ok {
		    color: green;
		    border: 1px solid green;
		}
		
		.error {
		    color: red;
		   
		}
     </style>
 
     <script>
     	function checklogin(){
     		 var user_name = $("#user_name").val();
			 var user_pwd = $("#user_pwd").val();
			 if(user_name=="" || user_pwd == ""){
				 $('#code').text("账号或密码不能为空！");
				 return false;
			 }
			return true;
     	}
     </script>
     
 </head>
 <body>
 	<img alt="login" src="${pageContext.request.contextPath }/images/Login.svg">
 	<div id="loginDiv" >
		<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/loginByUsername" method="post" onsubmit="return checklogin()">
			  <div class="form-group loginForm">
			   <label for="lastname" class="col-sm-2 control-label">用&nbsp;户：</label>
			    <div class="col-sm-10">
			      	<input type="text" class="form-control" name="username" id="user_name" placeholder="请输入用户昵称">
			      
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="lastname" class="col-sm-2 control-label">密&nbsp;码：</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control" name="password" id="user_pwd" placeholder="请输入密码">
			       <span id="code" class="error">${msg }</span>
			    </div>
			   
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox" id="remember">请记住我
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-outline-dark login">登录</button>
			        <button type="button" class="btn btn-outline-dark register">注册</button>
			    </div>
			  </div>
			</form>
	</div>
</body>
</html>