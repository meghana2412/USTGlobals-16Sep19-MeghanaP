package com.ustglobals.jpawithhibernetapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="person")
public class Person {
	
	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard voterCard;

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

	public VoterCard getVoterCard() {
		return voterCard;
	}

	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}
	
		
}
