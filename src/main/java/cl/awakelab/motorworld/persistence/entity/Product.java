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
@Table(name = "produts")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	@Column(name = "product_name")
	private String productName;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private Brand brand;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", insertable = false, updatable = false)
	private Category category;
	@Column(name = "model_year")
	private Short modelYear;
	@Column(name = "list_price")
	private Double listPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}
	
	public Short getModelYear() {
		return modelYear;
	}

	public void setModelYear(Short modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", brand=" + brand + ", category=" + category
				+ ", modelYear=" + modelYear + ", listPrice=" + listPrice + "]";
	}
}
