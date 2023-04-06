package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Customer;

public interface CustomerRepository {
	
	List<Customer> findAll();

	Customer findById(int id);

	Customer save(Customer customer);

	void delete(int id);

}
