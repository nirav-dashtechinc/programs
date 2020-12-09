package com.crud.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.crud.entity.Student;

public class StudentDAO {

	public static List<Student> findAll() {
		Session session = DBConnection.getConnection();
		Query query = session.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	public static Student findById(int studentId) {
		Session session = DBConnection.getConnection();
		return session.get(Student.class, studentId);
	}

	public static void saveOrUpdate(Student student) {
		Session session = DBConnection.getConnection();
		session.beginTransaction();
		session.saveOrUpdate(student);
		session.getTransaction().commit();
	}

	public static void delete(int studentId) {
		Session session = DBConnection.getConnection();
		session.beginTransaction();
		Student student = session.get(Student.class, studentId);
		session.delete(student);
		session.getTransaction().commit();
	}
}
