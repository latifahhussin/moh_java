<!-- step 1 - buat signin form (untuk login fail terlibat adalah pub/login.jsp, controller/Login.java, models/UserModel.java-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/pms/assets/bootstrap/css/bootstrap.css">
        <title>PMS Login</title>
    </head>
    <body>
        <!-- no daripada url yang login tidak berjaya -->
        <%
            String no = request.getParameter("no");
            if(no != null){
                out.print("<div class='alert alert-danger col-md-6'>Wrong Staff ID and Password</div>");
            }
        %>
        <div class="col-md-6" style="background-color: #eee;">
        <form method="post" action="/pms/login">
            <div>Staff ID</div>
            <div><input type="text" name="staff_id" class="form-control"></div>
            <div>Password</>
            <div><input type="password" name="pwd" class="form-control"></div>
            <div><input type="submit" value="Signin" class="btn btn-primary"></div>
        </form> 
        </div>
    </body>
</html>

    