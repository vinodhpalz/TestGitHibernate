package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig {

	private Configuration cfg;
	private SessionFactory sf;
	private Session sess;
	
	public DBConfig()
	{
		cfg = new Configuration();
		sf = cfg.configure("Hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	}
	public Session getSess()
	{
		sess = sf.getCurrentSession();
		return sess;
	}
}
