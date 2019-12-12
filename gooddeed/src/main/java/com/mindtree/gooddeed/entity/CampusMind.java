package com.mindtree.gooddeed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CampusMind {
	@Id
	private int mid;

	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	private GoodDeed gooddeed;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoodDeed getGooddeed() {
		return gooddeed;
	}

	public void setGooddeed(GoodDeed gooddeed) {
		this.gooddeed = gooddeed;
	}

	public CampusMind(int mid, String name, GoodDeed gooddeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.gooddeed = gooddeed;
	}

	public CampusMind() {
		super();
	}

	@Override
	public String toString() {
		return "CampusMind [mid=" + mid + ", name=" + name + ", gooddeed=" + gooddeed + "]";
	}

}
