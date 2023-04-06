package cl.awakelab.motorworld.domain.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.OrderRepository;
import cl.awakelab.motorworld.persistence.crud.CrudOrder;
import cl.awakelab.motorworld.persistence.entity.Order;
import cl.awakelab.motorworld.persistence.entity.Store;

@Service
public class OrderService implements OrderRepository {

	@Autowired
	private CrudOrder repoOrder;

	@Override
	public List<Order> findByStoreAndOrderStatus(Store Store, short orderStatus) {
		// TODO Auto-generated method stub
		return repoOrder.findByStoreAndOrderStatus(Store, orderStatus);
	}

	@Override
	public List<Order> findByStoreAndOrderStatusOrderDate(Store Store, short status, LocalDate date1, LocalDate date2) {
		// TODO Auto-generated method stub
		return repoOrder.findByStoreAndOrderStatusAndOrderDateBetweenOrderByOrderDateDesc(Store, status, date1, date2);
	}

	@Override
	public List<Order> findByOrderDate(LocalDate date1, LocalDate date2) {
		// TODO Auto-generated method stub
		return repoOrder.findByOrderDateBetween(date1, date2);
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return repoOrder.findAll();
	}

	


	

	

	


	
}
