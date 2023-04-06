package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.OrderItem;

public interface OrderItemRepository {
	List<OrderItem> findAll();

	OrderItem findById(int id);

	OrderItem save(OrderItem orderItem);

	void delete(int id);
}
