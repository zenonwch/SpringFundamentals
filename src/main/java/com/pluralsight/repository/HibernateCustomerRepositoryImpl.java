package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUserName}")
	private String dbUserName;

	@Override
	public List<Customer> findAll() {
		System.out.println(dbUserName);

		final List<Customer> customers = new ArrayList<>();

		final Customer customer = new Customer();
		customer.setFirstName("Andrey");
		customer.setLastName("Veshtard");

		customers.add(customer);

		return customers;
	}
}
