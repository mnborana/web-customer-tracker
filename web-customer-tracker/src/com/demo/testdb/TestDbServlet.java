package com.demo.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String user = "root";
		String pass = "";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			out.println("connecting to db");
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("connection success");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
}
