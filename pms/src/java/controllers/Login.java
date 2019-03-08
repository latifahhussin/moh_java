//step 3 - buat signin form
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.UserModel;


@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     HttpSession session = req.getSession();
     session.invalidate();
     res.sendRedirect("/pms/pub/login.jsp");
    }
    
    @Override
    //step 1 - untuk Signin 
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String staffId = req.getParameter("staff_id");//step 1- sudah baca daripada form pub/login.jsp
        String pwd = req.getParameter("pwd"); 
        UserModel user = new UserModel();
        if(user.isExist(staffId, pwd)){
            //user wujud, set session then go to project list
            HttpSession sess = req.getSession();
            sess.setAttribute("loggedin", true);
            sess.setAttribute("user",user); // step2- save an object into session, relate with session logout
            res.sendRedirect("/pms/project");
        }else{
            //user tak wujud, go back to login
            res.sendRedirect("/pms/pub/login.jsp?no");
        }
        
    }

    

}