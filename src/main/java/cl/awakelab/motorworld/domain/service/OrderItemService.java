package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.OrderItemRepository;
import cl.awakelab.motorworld.persistence.crud.CrudOrderItem;
import cl.awakelab.motorworld.persistence.entity.OrderItem;

@Service
public class OrderItemService implements OrderItemRepository{

	@Autowired
	CrudOrderItem repoOrderItem;
	
	@Override
	public List<OrderItem> findAll() {
		// TODO Auto-generated method stub
		return repoOrderItem.findAll();
	}

	@Override
	public OrderItem findById(int id) {
		Optional<OrderItem> opcional = repoOrderItem.findById(id);
		OrderItem orderItem = null;
		if (opcional.isPresent())
			orderItem = opcional.get();
		return orderItem;
	}

	@Override
	public OrderItem save(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return repoOrderItem.save(orderItem);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoOrderItem.deleteById(id);
	}

}
