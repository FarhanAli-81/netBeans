/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet{
    // lifecycle method
    
    //object of server created
    // configuration obje is created [ServletConfig conf
    // init method called by passing CONFIGURATION OBJ As paramerter
    
    
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("cretating object");
    }
    
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("serviceing");
        
        resp.setContentType("text/html");
        
        PrintWriter out=resp.getWriter();
        out.println("<h1>tis is my output from servlet method</h1>");
     //   out.println("<h1>todays date and time is "+new Date().toString()+"</h1>");
        
        
    }
    public void destroy(){
        System.out.println("going to destroy servlet object");
    }
    // non lifecycle methods
    
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return "this servlet is created by Farhan Ali";
        
    }
    
}
