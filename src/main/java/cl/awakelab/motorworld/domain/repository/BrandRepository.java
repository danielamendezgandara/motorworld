package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Brand;

public interface BrandRepository {
	List<Brand> findAll();

	Brand findById(int id);

	Brand save(Brand brand);

	void delete(int id);
}
