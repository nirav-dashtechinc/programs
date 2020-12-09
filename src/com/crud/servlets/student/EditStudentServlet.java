package com.crud.servlets.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.StudentDAO;
import com.crud.entity.Student;

@WebServlet("/student/edit")
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student student = StudentDAO.findById(id);
		req.setAttribute("student", student);

		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/student/edit.jsp");
		rd.include(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Student student = new Student(Integer.parseInt(req.getParameter("id")), req.getParameter("name"), req.getParameter("city"));
		StudentDAO.saveOrUpdate(student);

		res.sendRedirect("/servlet_hibernate_crud/students");
	}
}
