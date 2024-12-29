package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Program1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
//			Creating Session Factory
			sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

//			Create Session
			session = sessionFactory.openSession();

//			Create Transaction
			Transaction transaction = session.beginTransaction();

//			CRUD Operations
			Student s1 = new Student();
			System.out.println(s1);

			transaction.commit();
		} finally {
//			Closing Resources
			session.close();
			sessionFactory.close();
		}
	}

}
