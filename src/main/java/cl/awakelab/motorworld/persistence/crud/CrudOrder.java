package cl.awakelab.motorworld.persistence.crud;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Order;
import cl.awakelab.motorworld.persistence.entity.Store;

public interface CrudOrder extends JpaRepository<Order, Integer> {
	
	List<Order> findByStoreAndOrderStatus(Store store, short orderStatus);
	List<Order> findByStoreAndOrderStatusAndOrderDateBetweenOrderByOrderDateDesc(Store store, short orderStatus,LocalDate date1,LocalDate date2);
	List<Order> findByOrderDateBetween(LocalDate date1,LocalDate date2);
	

}
