package com.mindtree.gooddeed.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.gooddeed.entity.GoodDeed;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CampusMindDto {
	private int mid;
	private String name;
	@JsonIgnore
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
	public CampusMindDto(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	public CampusMindDto() {
		super();
	}
	
}
