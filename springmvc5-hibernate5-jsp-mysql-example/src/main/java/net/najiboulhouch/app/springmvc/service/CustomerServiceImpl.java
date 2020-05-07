/**
 * 
 */
package net.najiboulhouch.app.springmvc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.najiboulhouch.app.springmvc.dao.CustomerDAO;
import net.najiboulhouch.app.springmvc.entity.Customer;

/**
 * @author NAJIB
 * @version 1.0 
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		return customerDAO.getCustomer(id);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);		
	}

}
