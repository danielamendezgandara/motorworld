package cl.awakelab.motorworld.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer idStore;
	@Column(name = "store_name")
	private String  storeName;
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	@Column(name = "zip_code")
	private String zipCode;
	
	public Integer getIdStore() {
		return idStore;
	}
	public void setIdStore(Integer id) {
		this.idStore = id;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Store [idStore=" + idStore + ", storeName=" + storeName + ", phone=" + phone + ", email=" + email
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

	
	
	

}
