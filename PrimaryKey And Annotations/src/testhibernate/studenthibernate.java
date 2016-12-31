package testhibernate;

import java.sql.Date;
import java.util.GregorianCalendar;
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
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		{
		
		student deepak = new student();
		//deepak.setEmpid(15316);
		deepak.setEmpname("deepak reddy merugu");
		deepak.setEmail("deepak@gmail.com");
		deepak.setPassword("password");
		deepak.setFulltime(false);
		deepak.setEmplogin(Date.valueOf("2014-09-15"));
		deepak.setEmpjoindate(new GregorianCalendar(2009, 5, 15));
		session.save(deepak);
		}
		//session.getTransaction().commit();
		{
		student reddy = new student();
		reddy.setEmpname("deepak reddy merugu");
		reddy.setEmail("reddy@gmail.com");
		reddy.setPassword("password");
		reddy.setFulltime(false);
		reddy.setEmplogin(Date.valueOf("2014-09-15"));
		reddy.setEmpjoindate(new GregorianCalendar(2009, 5, 15));
		session.save(reddy);
		}
		//session.getTransaction().commit();
		{
		
		student shashi = new student();

		shashi.setEmpname("deepak reddy merugu");
		shashi.setEmail("shashi@gmail.com");
		shashi.setPassword("password");
		shashi.setFulltime(false);
		shashi.setEmplogin(Date.valueOf("2014-09-15"));
		shashi.setEmpjoindate(new GregorianCalendar(2009, 5, 15));
		
		session.save(shashi);

		}
		
		session.getTransaction().commit();
	}

}
