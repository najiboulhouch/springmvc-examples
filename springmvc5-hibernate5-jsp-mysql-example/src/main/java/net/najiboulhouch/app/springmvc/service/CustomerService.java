/**
 * 
 */
package net.najiboulhouch.app.springmvc.service;

import java.util.List;

import net.najiboulhouch.app.springmvc.entity.Customer;

/**
 * @author NAJIB
 * @version 1.0 
 */
public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}