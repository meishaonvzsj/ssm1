<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>

</head>
<body>
   姓名：<input type="text" name="ename" id="inp"><span id="sp"></span><br/><br/>
   密码：<input type="password" name="pwd">
  
   <script type="text/javascript">
       var ename=$("#inp").val();        
        $("#inp").blur(function(){
        	$.ajax({
        		url:"validate.action",
        		type:"POST",
        		dataType:"json",
        		cache:false,
        		data:{ename:ename},
        		
        		success:function(response){       			
        			if(response.ename!=null){
        				$("#sp").html("用户名已存在");
        			}else {
        				$("#sp").html("用户名可注册");
        			}
        		}
        	})
        	
        });
        	
        	 
        
        
   
   </script>
</body>
</html>