package com.ustglobals.springmvcassessment.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="productOrder")
public class Order {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	
//	
//	  @ManyToOne(cascade = CascadeType.ALL)
//	 
	// @JoinColumn(name="pid", nullable=false) 
	  //@JoinColumn(name="id",nullable=false)
	 //private Retailer retailer;
	 

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}
	
	
}
