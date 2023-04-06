package cl.awakelab.motorworld.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stocks")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "stock_id")
    private Integer id;
	private Integer quantity;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", insertable = false, updatable = false)
	private Store store;
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/*@Override
	public String toString() {
		return "Stock [id=" + id + ", quantity=" + quantity + ", store=" + store + ", product=" + product + "]";
	}*/

	
}
