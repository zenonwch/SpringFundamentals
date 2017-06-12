package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		final List<Customer> customers = new ArrayList<>();

		final Customer customer = new Customer();
		customer.setFirstName("Andrey");
		customer.setLastName("Veshtard");

		customers.add(customer);

		return customers;
	}
}
