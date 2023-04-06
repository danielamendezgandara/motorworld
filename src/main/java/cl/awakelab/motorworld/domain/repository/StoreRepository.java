package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Store;

public interface StoreRepository {
  
	Store findStoreById(int id);
	List<Store> findAll();
}
