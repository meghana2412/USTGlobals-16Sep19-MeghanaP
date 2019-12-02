package com.ustglobals.springmvcassessment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(insertable=false, updatable=false)
	@GeneratedValue
	private int pid;
	
	@Column
	private String pname;
	
	@Column
	private int priceperunit;
	
	@Column
	private int quantity;
	
	@Column
	private double amountpayable;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(int priceperunit) {
		this.priceperunit = priceperunit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(double amountpayable) {
		this.amountpayable = amountpayable;
	}
	
	
}
