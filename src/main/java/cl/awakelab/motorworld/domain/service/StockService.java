package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.StockRepository;
import cl.awakelab.motorworld.persistence.crud.CrudStock;
import cl.awakelab.motorworld.persistence.entity.Stock;

@Service
public class StockService implements StockRepository {
	
	@Autowired
	CrudStock repoStock;

	@Override
	public List<Stock> findAll() {
		// TODO Auto-generated method stub
		return repoStock.findAll();
	}

	@Override
	public Stock findById(int id) {
		// TODO Auto-generated method stub
		Optional<Stock> opcional = repoStock.findById(id);
		Stock stock = null;
		if (opcional.isPresent())
			stock = opcional.get();
		return stock;
	}

	@Override
	public Stock save(Stock stock) {
		// TODO Auto-generated method stub
		return repoStock.save(stock);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoStock.deleteById(id);
	}
	

}
