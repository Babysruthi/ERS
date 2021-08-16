package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.service.EmployeeLoginService;
import com.project.ers.service.EmployeeLoginServiceImp;


public class NewLoginCredentialsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		String confirmpwd=request.getParameter("confirmpwd");
	
		if(pwd.equals(confirmpwd))
		{
			
		EmployeeLogin employeeLogin=new EmployeeLogin();
		employeeLogin.setUserName(username);
		employeeLogin.setPwd(pwd);
		employeeLogin.setConfirmPwd(confirmpwd);
		
		 EmployeeLoginService employeeLoginService= new EmployeeLoginServiceImp();
		
	     int result=employeeLoginService.newEmpLogin(employeeLogin);
	     if(result==1)
	     {
	    	 out.println("Password Changed successfully");
	    	 response.sendRedirect("http://localhost:8080/ERS/loginValidation.html");
	    	 
	     }
	     
		}
	
	}

}
