package com.mindtree.gooddeed.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.dto.CampusMindDto;
import com.mindtree.gooddeed.entity.GoodDeed;

@Service
public interface GoodDeedService {

	public void addGoodDeedToCampusMind(List<CampusMindDto> campusmind, int goodDeedId);

	public List<CampusMindDto> getAllCampusMindsForPerticularGoodDeedId(int goodDeedId);

	public List<GoodDeed> getAllGoodDeedsForCampusMindsLessThanThree();

	public GoodDeed getSupervisorAndItsObjects(int supervisorId);

}
