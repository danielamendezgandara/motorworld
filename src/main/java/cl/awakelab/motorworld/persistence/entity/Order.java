package cl.awakelab.motorworld.persistence.entity;

import java.time.LocalDate;
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
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", insertable = false, updatable = false)
	private Customer customer;
	@Column(name = "order_status")
	private Short orderStatus;
	@Column(name = "order_date")
	private LocalDate orderDate;
	@Column(name = "required_date")
	private LocalDate requiredDate;
	@Column(name = "shipped_date")
	private LocalDate shippedDate;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", insertable = false, updatable = false)
	private Store store;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "staff_id", insertable = false, updatable = false)
	private Staff staff;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(LocalDate requiredDate) {
		this.requiredDate = requiredDate;
	}

	public LocalDate getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(LocalDate shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", orderStatus=" + orderStatus + ", orderDate="
				+ orderDate + ", requiredDate=" + requiredDate + ", shippedDate=" + shippedDate + ", store=" + store
				+ ", staff=" + staff + "]";
	}



    
}
