package testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class studenthibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config= new Configuration(); 
		config.addAnnotatedClass(student.class);
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(true, true);
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		student deepak = new student();
		deepak.setEmpid(15856);
		deepak.setEmpname("deepak reddy merugu");
		

		session.save(deepak);
		session.getTransaction().commit();
	}

}
