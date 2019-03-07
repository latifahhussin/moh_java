<%-- 
    Document   : decision
    Created on : Mar 6, 2019, 3:26:01 PM
    Author     : Pengguna PC 01
--%>
<%!
int day = 3;
%>
<%if (day == 1 | day == 7) {%>
        <p>Today is weekend </p>
        <% } else { %>
        <p>Today is not weekend</p>
 <% } 
 %>
         
