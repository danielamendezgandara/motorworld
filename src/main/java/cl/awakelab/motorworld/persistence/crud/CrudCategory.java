package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Category;

public interface CrudCategory extends JpaRepository<Category, Integer> {

}
