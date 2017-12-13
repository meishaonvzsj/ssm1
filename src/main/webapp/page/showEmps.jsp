<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
   <form action="removeEmps.action" method="post" id="myForm">
     <center>
     <table width="80%"> 
     <tr>
     <td>姓名：<input type="text" name="eName" value="${param.eName }" ></td>
     <td>薪资：<input type="text" name="sal" value="${param.sal }" ></td>
     <td> <input type="button" value="查询" id="selectEmpsByCondition"></td>
     <td> <input type="button" value="修改" id="updateEmps"></td>
     </tr>   
     <tr>
     <td><input type="submit" value="批量删除"></td>
     <td>姓名</td>
     <td>职位</td>
     <td>入职日期</td>
     <td>薪资</td>     
     </tr>
    
     <c:forEach items="${emps }" var="emps">
     <tr> 
     <td><input type="checkbox" name="empNos" value="${emps.empno }"></td>  
     <td>${emps.ename } </td>
     <td>${emps.job } </td>
     <td>${emps.hiredate }</td>
     <td>${emps.sal } </td> 
     <td><a href="removeEmp.action?empNo=${emps.empno }"> 删除</a></td>
     </tr>
     </c:forEach>    
     </table>
     </center>    
     </form>
     
     <script type="text/javascript">
     
     $("#selectEmpsByCondition").click(function(){
    	 $("#myForm").attr("action","selectEmpsByCondition.action");
    	 $("#myForm").submit();
     });
     
     $("#updateEmps").click(function(){
    	location.href="updateEmps.jsp";
     });
     
     </script>
</body>
</html>