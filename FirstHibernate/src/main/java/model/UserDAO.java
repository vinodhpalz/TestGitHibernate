package model;

import org.hibernate.Session;

public class UserDAO {

	private DBConfig db;
	private Session sess;
	public UserDAO()
	{
		db = new DBConfig();
		
	}
	
	public void insertUser(User p)
	{
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
	}
	
}
