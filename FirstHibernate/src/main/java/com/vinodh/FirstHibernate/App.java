package com.vinodh.FirstHibernate;

import model.Product;
import model.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		Product p = new Product("Orange",3000);
    		ProductDAO pd = new ProductDAO();
    		pd.insertProduct(p);
    		System.out.println("Success");
    	}catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
        
    }
}
