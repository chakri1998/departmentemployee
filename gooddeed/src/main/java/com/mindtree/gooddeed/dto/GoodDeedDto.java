package com.mindtree.gooddeed.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.Supervisor;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class GoodDeedDto {
	
	private int goodDeedId;	
	private String goodDeedName;
	
	private Supervisor supervisor;	
	
	List<CampusMind> campusMinds;
	public int getGoodDeedId() {
		return goodDeedId;
	}
	public void setGoodDeedId(int goodDeedId) {
		this.goodDeedId = goodDeedId;
	}
	public String getGoodDeedName() {
		return goodDeedName;
	}
	public void setGoodDeedName(String goodDeedName) {
		this.goodDeedName = goodDeedName;
	}
	public GoodDeedDto(int goodDeedId, String goodDeedName) {
		super();
		this.goodDeedId = goodDeedId;
		this.goodDeedName = goodDeedName;
	}
	public GoodDeedDto() {
		super();
	}
	
	
	
	
}
