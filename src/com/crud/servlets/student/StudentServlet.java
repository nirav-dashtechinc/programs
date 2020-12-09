package com.crud.servlets.student;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.StudentDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm", "root", "123456789");
			if (con != null) {
				System.out.println("You are connected");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("students", StudentDAO.findAll());

		RequestDispatcher rd = req.getRequestDispatcher("./WEB-INF/view/student/index.jsp");
		rd.include(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {

	}
}
