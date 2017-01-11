package com.ironyard;

import java.io.IOException;

/**
 * Created by jasonskipper on 1/10/17.
 */
public class MyFirstServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("Hello From My First Servlet!");
    }
}
