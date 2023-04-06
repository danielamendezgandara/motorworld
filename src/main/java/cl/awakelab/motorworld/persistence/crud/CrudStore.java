package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Store;

public interface CrudStore extends JpaRepository<Store, Integer> {
	

}
