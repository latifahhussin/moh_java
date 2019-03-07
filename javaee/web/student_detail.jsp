<%-- 
    Document   : student_detail
    Created on : Mar 6, 2019, 3:47:23 PM
    Author     : Pengguna PC 01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.StudentModel"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            StudentModel stud = (StudentModel) request.getAttribute("stud");
            out.print("Nama Student : " + stud.name);
            out.print("<br>");
            out.print("Student ID : " + stud.id);
         %>
        <h1>Student Detail</h1>

    </body>
</html>
