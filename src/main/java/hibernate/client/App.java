package hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Employee;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Harry");
		e.setGender("Male");
		e.setSalary(22200);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		tx.commit();
		
	}

}
