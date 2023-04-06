package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.BrandRepository;
import cl.awakelab.motorworld.persistence.crud.CrudBrand;
import cl.awakelab.motorworld.persistence.entity.Brand;

@Service
public class BrandService implements BrandRepository {
	
	private final CrudBrand repoBrand;
	
	public BrandService(CrudBrand repoBrand) {
		this.repoBrand = repoBrand;
	}

	@Override
	public List<Brand> findAll() {
		
		return repoBrand.findAll();
	}

	@Override
	public Brand findById(int id) {
		Optional<Brand> opcional = repoBrand.findById(id);
		Brand brand = null;
		if (opcional.isPresent())
			brand = opcional.get();
		return brand;
	}

	@Override
	public Brand save(Brand brand) {
		// TODO Auto-generated method stub
		return repoBrand.save(brand);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoBrand.deleteById(id);
		
	}

}
