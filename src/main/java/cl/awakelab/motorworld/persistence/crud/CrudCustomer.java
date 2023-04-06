package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Customer;

public interface CrudCustomer extends JpaRepository<Customer, Integer> {

}
