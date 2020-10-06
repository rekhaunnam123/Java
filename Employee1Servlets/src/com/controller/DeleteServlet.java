package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;


public class DeleteServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        EmployeeDao employeeDao=new EmployeeDaoImpl();
        employeeDao.delete(id);
        response.sendRedirect("ViewServlet");  
	}

}
