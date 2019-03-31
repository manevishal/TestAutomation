package com.rule14.TestCase;

import org.testng.annotations.Test;
import com.rule14.Application.Customer;

public class CustomerPage
{
   @Test(priority=1)
   public void cancelNewCustomer() throws InterruptedException
   {
	   Customer customer = new Customer();
	   customer.cancelCustomer();
   }
   
   @Test(priority=2)
   public void addNewCustomer() throws InterruptedException
   {
	   Customer customer = new Customer();
	   customer.addCustomer();
   }
   
   @Test(priority=3)
   public void duplicateNewCustomer() throws InterruptedException
   {
	   Customer customer = new Customer();
	   customer.duplicateCustomer();
   }
}
