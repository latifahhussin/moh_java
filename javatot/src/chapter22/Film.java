package chapter22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Film {
    protected void list()    {
     Connection con = null;
     Statement stmt = null;
     ResultSet rs = null;   
        // list all film title and desc
       // try ..catch = exception/error handling
       // code berada dalam try, catch bila berlaku error
       try{
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
       } catch(Exception e){
           System.out.println("Berlaku Error");
           System.out.println(e.getMessage());
                  }
   }
   
   public static void main(String[] args){
       Film f = new Film();
       f.list();
   }
}
