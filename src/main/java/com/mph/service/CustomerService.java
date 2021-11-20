package com.mph.service;

import java.util.List;

import com.mph.entity.Customer;

public interface CustomerService 
{

	public List<Customer> getCustomerList();

	public void createCustomer(Customer customer);

	public List<Customer> updateCustomer(Customer customer);

	public List<Customer> deleteCustomer(int customerid);

	public Customer getCustomerById(int customerid);

	public List<Customer> searchCustomerById(int customerid);

	public Customer getCustomer(Customer customer);
	

} 
