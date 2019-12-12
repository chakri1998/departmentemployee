package com.mindtree.gooddeed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.dto.CampusMindDto;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.service.GoodDeedService;

@RestController
public class GoodDeedController {
	@Autowired 
	GoodDeedService goodDeedService;

	@PostMapping("/gooddeed/add/campusmind/{goodDeedId}")
	public String addGoodDeedToCampusMind(@RequestBody List<CampusMindDto> campusminddto, @PathVariable("goodDeedId") int goodDeedId) {
	goodDeedService.addGoodDeedToCampusMind(campusminddto,goodDeedId);			
	return "success";	
	}
	@GetMapping("/displaycampusmind/gooddeed/{goodDeedId}")
	public List<CampusMindDto> displayCampusMindForGoodDeedId(@PathVariable("goodDeedId") int goodDeedId){
		List<CampusMindDto> campusMindsDto= new ArrayList<>();
		campusMindsDto=goodDeedService.getAllCampusMindsForPerticularGoodDeedId(goodDeedId);
		return campusMindsDto;
	}
	
	@GetMapping("/dispalygooddeeds/campusmind")
	public List<GoodDeed> displayAllGoodDeedsForCampusMindsLessThanThree(){
		List<GoodDeed>goodDeeds=new ArrayList<>();
		goodDeeds=goodDeedService.getAllGoodDeedsForCampusMindsLessThanThree();
		return goodDeeds;		
	}
	
	@GetMapping("/displaysupervisor/gooddeed/campusminds/{supervisorId}")
	public GoodDeed displaySupervisorAndItsObjects(@PathVariable("supervisorId") int supervisorId) {
		GoodDeed goodDeed=new GoodDeed();
		goodDeed=goodDeedService.getSupervisorAndItsObjects(supervisorId);

		
		return goodDeed;
	}
}
