package cl.awakelab.motorworld.domain.repository;

import java.time.LocalDate;
import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Order;
import cl.awakelab.motorworld.persistence.entity.Store;

public interface OrderRepository {
	
  List<Order> findByStoreAndOrderStatus(Store Store, short orderStatus);
  List<Order> findByStoreAndOrderStatusOrderDate(Store Store, short orderStatus,LocalDate date1,LocalDate date2);
  List<Order> findByOrderDate(LocalDate date1,LocalDate date2);
  List<Order> findAll();


}
