package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.CategoryRepository;
import cl.awakelab.motorworld.persistence.crud.CrudCategory;
import cl.awakelab.motorworld.persistence.entity.Category;

@Service
public class CategoryService implements CategoryRepository{
	
	private final CrudCategory repoCategory;
	
	public CategoryService(CrudCategory repoCategory) {
		this.repoCategory = repoCategory;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return repoCategory.findAll();
	}

	@Override
	public Category findById(int id) {
		Optional<Category> opcional = repoCategory.findById(id);
		Category category = null;
		if (opcional.isPresent())
			category = opcional.get();
		return category;
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return repoCategory.save(category);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoCategory.deleteById(id);
		
	}
	

}
