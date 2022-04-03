package com.ex.hibernate.clint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.hibernate.entities.Emp;

public class Clint {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setName("Harsha");
		e1.setSal(5000);
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(e1);
		tx.commit();
	}
}
