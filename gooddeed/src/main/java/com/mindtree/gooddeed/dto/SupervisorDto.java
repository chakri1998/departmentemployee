package com.mindtree.gooddeed.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.gooddeed.entity.GoodDeed;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class SupervisorDto {
	private int supervisorId;
	private String supervisorName;
	@JsonIgnore
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
	public SupervisorDto(int supervisorId, String supervisorName) {
		super();
		this.supervisorId = supervisorId;
		this.supervisorName = supervisorName;
		
	}
	public SupervisorDto() {
		super();
	}
	
}
