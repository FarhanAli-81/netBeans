/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.*;


public class SecondServlet  extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException, ServletException{
        System.out.println("this is servet using generic servlet which imlements sevlet");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is second servlet using generic servlett");
    }
}
