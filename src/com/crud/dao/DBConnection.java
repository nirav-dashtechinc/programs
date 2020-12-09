package com.crud.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	public static Session getConnection() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	}
}
