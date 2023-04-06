package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.StoreRepository;
import cl.awakelab.motorworld.persistence.crud.CrudStore;
import cl.awakelab.motorworld.persistence.entity.Store;

@Service
public class StoreService implements StoreRepository {
    
	@Autowired
	private CrudStore repoStore;
	
	@Override
	public Store findStoreById(int id) {
		// TODO Auto-generated method stub
		Optional<Store> opcional = repoStore.findById(id);
		Store store = null;
		if (opcional.isPresent())
			store = opcional.get();
		return store;
	}

	@Override
	public List<Store> findAll() {
		// TODO Auto-generated method stub
		return repoStore.findAll();
	}

}
