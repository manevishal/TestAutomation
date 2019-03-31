package com.rule14.TestCase;

import org.testng.annotations.Test;

import com.rule14.Application.Product;

public class ProductPage
{
	
	  @Test(priority=1)
	  public void cancelNewProduct() throws InterruptedException
	  {
		  Product product = new Product();
		  product.cancelProduct();
	  }
	  
	  @Test(priority=2)
	  public void addNewProduct() throws InterruptedException
	  {
		  Product product = new Product();
		  product.addProduct();
	  }
	  
	  @Test(priority=3)
	  public void duplicateNewProduct() throws InterruptedException
	  {
		  Product product = new Product();
		  product.duplicateProduct();
	  }
}
