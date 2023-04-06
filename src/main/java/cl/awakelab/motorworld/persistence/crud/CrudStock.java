package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Stock;

public interface CrudStock extends JpaRepository<Stock, Integer> {

}
