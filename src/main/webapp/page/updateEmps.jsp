<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form >
     <center>
     <table width="80%"> 
     <tr>
     <td>姓名</td>
     <td>职位</td>
     <td>入职日期</td>
     <td>薪资</td>     
     </tr>
    
     <c:forEach items="${emps }" var="emps">
     <tr> 
     
    <td>${emps.ename } </td> 
     <td>${emps.job } </td>
     <td>${emps.hiredate }</td>
     <td>${emps.sal } </td> 
     
     </tr>
     </c:forEach>    
     </table>
     
     </center>    
     </form>
     
</body>
</html>