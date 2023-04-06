package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.CustomerRepository;
import cl.awakelab.motorworld.persistence.crud.CrudCustomer;
import cl.awakelab.motorworld.persistence.entity.Customer;

@Service
public class CustomerService implements CustomerRepository {

	@Autowired
	CrudCustomer repoCustomer;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repoCustomer.findAll();
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> opcional = repoCustomer.findById(id);
		Customer customer = null;
		if (opcional.isPresent())
			customer = opcional.get();
		return customer;
	}

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return repoCustomer.save(customer);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoCustomer.deleteById(id);
		
	}

}
