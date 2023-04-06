package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.OrderItem;

public interface CrudOrderItem extends JpaRepository<OrderItem, Integer> {

}
