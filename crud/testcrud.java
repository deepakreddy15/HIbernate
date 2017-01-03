package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import manytomany.dlegates;
import manytomany.event;

public class testcrud {

	public static void main(String[] args) {
		
		Configuration config= new Configuration(); 
		config.addAnnotatedClass(userdetails.class);
		
		config.configure("hibernate.cfg.xml");
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		
		userdetails user= (userdetails) session.get(userdetails.class, 6);
		user.setUsername("deepak");
		session.update(user);
		user.setUsername("reddy");
		session.save(user);
		session.beginTransaction().commit();
		
	}

}
