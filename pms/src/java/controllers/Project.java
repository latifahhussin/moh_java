//step 2 - fail Project.java daripada Controllers - Buat selepas ProjectModel.java daripada Models 
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; //step 3
import static java.util.Collections.list; //step 6
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel; //step 4

@WebServlet(name = "Project", urlPatterns = {"/project"}) //automatik dari create servlet
public class Project extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //step 1 - pastikan ada doGet sahaja
       // ArrayList arr = new models.ProjectModel().getAll(); // guna cara ini jika tak import models.ProjectModel
        
        String action = request.getParameter("action"); //step 8 --untuk edit dan delete masa passig
        if(action != null){
            int id = Integer.parseInt(request.getParameter("id"));  
            ProjectModel pro = new ProjectModel();
                
            if(action.equals("edit")){
                //show form with original data
                pro = pro.getOne(id);
                request.setAttribute("project", pro); //hantar data melalui project
                request.getRequestDispatcher("project/form.jsp").forward(request, response);
            }else if(action.equals("del")){
                pro.delete(id);
            }
        }
        ArrayList list = new ProjectModel().getAll();//step 2 - create object class ProjectModel dan getAll
        request.setAttribute("list", list); //step 5
        request.getRequestDispatcher("project/list.jsp").forward(request, response); //untuk papar di jsp
    }
    
    //step 7
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //step 1 - pastikan ada doGet sahaja
       String search = request.getParameter("search"); //untuk searching
       if(search != null){
           //search
           String title = request.getParameter("title");
           String desc = request.getParameter("description");
           ProjectModel pro = new ProjectModel();
           ArrayList list = pro.search(title, desc);
           request.setAttribute("list", list);
           request.getRequestDispatcher("project/list.jsp").forward(request,response);
       }else{
           //insert dan update
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            String id = request.getParameter("id"); //step 9
            //System.out.println("id="+id);
            ProjectModel pro = new ProjectModel();
            pro.setTitle(title);
            pro.setDescription(description);
            
            if(id.equals("0")){ // step 10 - for update
                //insert
                pro.insert();
            }else{
                //update
                int id2 = Integer.parseInt(id);
                pro.update(id2);
            }
            //another technique - request.getRequestDispatcher("project/list.jsp").forward(request,response);
            response.sendRedirect("project"); 
        
        }
  
   }

}