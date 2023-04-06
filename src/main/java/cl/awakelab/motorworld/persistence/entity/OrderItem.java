package cl.awakelab.motorworld.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {

	@Id
	@Column(name = "item_id")
	private Integer id;
	private Integer quantity;
	@Column(name = "list_price")
	private Double listPrice;
	private Double discount;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id", insertable = false, updatable = false)
	private Order order;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	private Product product;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", quantity=" + quantity + ", listPrice=" + listPrice + ", discount=" + discount
				+ ", order=" + order + ", product=" + product + "]";
	}

}
