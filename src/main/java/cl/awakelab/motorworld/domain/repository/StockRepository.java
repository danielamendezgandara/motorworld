package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Stock;

public interface StockRepository {
	
	List<Stock> findAll();

	Stock findById(int id);

	Stock save(Stock stock);

	void delete(int id);

}
