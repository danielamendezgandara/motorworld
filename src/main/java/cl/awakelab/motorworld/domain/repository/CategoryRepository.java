package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Category;

public interface CategoryRepository {
  
	List<Category> findAll();

	Category findById(int id);

	Category save(Category category);

	void delete(int id);
}
