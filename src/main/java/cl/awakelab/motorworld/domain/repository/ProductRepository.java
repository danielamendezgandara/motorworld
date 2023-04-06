package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Product;

public interface ProductRepository {
	List<Product> findAll();

	Product findById(int id);

	Product save(Product product);

	void delete(int id);

}
