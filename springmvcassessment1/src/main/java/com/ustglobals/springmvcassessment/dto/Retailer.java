package com.ustglobals.springmvcassessment.dto;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="retailer")
public class Retailer {

	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column(length=17)
	private String name;
	
	@Column
	private String email;
	
	
	 @Column 
	 private String password;
	 
	// @OneToMany(mappedBy="reatiler")
	 
	 //private List<Order> productOrder;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
