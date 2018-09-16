package model;

import org.hibernate.Session;

public class ProductDAO {

	private DBConfig db;
	private Session sess;
	public ProductDAO()
	{
		db = new DBConfig();
		
	}
	
	public void insertProduct(Product p)
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
