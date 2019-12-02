package com.ustglobals.springmvcassessment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productOrder")
public class Order {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	
	
	  @OneToMany(cascade = CascadeType.ALL)
	 
	 @JoinColumn(name="pid", nullable=false) 
	  @JoinColumn(name="id",nullable=false)
	 private List<Product> product;
	 

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}
	
	
}
