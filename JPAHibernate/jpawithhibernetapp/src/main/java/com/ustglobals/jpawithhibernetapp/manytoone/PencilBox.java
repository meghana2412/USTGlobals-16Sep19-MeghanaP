package com.ustglobals.jpawithhibernetapp.manytoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="pencilBox")
public class PencilBox {

	@Id
	@Column
	private int bid;
	
	@Column
	private String bname;
	
	@OneToMany(mappedBy = "pencilBox")
	private List<Pencil> pencil;
	

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Pencil> getPencil() {
		return pencil;
	}

	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}

	
	
}
