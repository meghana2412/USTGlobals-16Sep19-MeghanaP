package com.ustglobals.stockmanagement.dto;

//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="products_info")
public class Product {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="order_history_info",
//	sourceEntity.JoinColums=@JoinColumn(name="id"),
//	targetEntity.inverseColumns=@JoinColumn(name="orderId"))
//	
	//private List<Order> order;
	
	
	//public List<Order> getOrder() {
	//	return order;
	//}
	//public void setOrder(List<Order> order) {
	//	this.order = order;
	//}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
