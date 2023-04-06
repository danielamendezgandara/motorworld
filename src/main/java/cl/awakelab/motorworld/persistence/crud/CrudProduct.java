package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Product;

public interface CrudProduct extends JpaRepository<Product, Integer> {

}
