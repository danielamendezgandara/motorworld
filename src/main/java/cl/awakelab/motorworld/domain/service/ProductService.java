package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.ProductRepository;
import cl.awakelab.motorworld.persistence.crud.CrudProduct;
import cl.awakelab.motorworld.persistence.entity.Product;

@Service
public class ProductService implements ProductRepository{
	
	@Autowired
	CrudProduct repoProduct;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repoProduct.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> opcional = repoProduct.findById(id);
		Product product = null;
		if (opcional.isPresent())
			product = opcional.get();
		return product;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repoProduct.save(product);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoProduct.deleteById(id);
		
	}

}
