package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	@Autowired                                                                                                  // Member injection
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	@Autowired                                                                                                  //Constructor injection
	public CustomerServiceImpl(final CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection here");
		this.customerRepository = customerRepository;
	}

//	@Autowired                                                                                                  // Setter injection
	public void setCustomerRepository(final CustomerRepository customerRepository) {
		System.out.println("We are using setter injection here");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
