package com.mindtree.gooddeed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supervisor {
	
	@Id
	private int supervisorId;
	private String supervisorName;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private GoodDeed gooddeed;

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public GoodDeed getGooddeed() {
		return gooddeed;
	}

	public void setGoodDeed(GoodDeed gooddeed) {
		this.gooddeed = gooddeed;
	}

	public Supervisor(int supervisorId, String supervisorName, GoodDeed gooddeed) {
		super();
		this.supervisorId = supervisorId;
		this.supervisorName = supervisorName;
		this.gooddeed = gooddeed;
	}

	public Supervisor() {
		super();
	}

	@Override
	public String toString() {
		return "Supervisor [supervisorId=" + supervisorId + ", supervisorName=" + supervisorName + ", goodDeed="
				+ gooddeed + "]";
	}

	
	
}
