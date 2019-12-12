package com.mindtree.gooddeed.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.dto.CampusMindDto;
import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.entity.Supervisor;
import com.mindtree.gooddeed.repository.CampusMindRepository;
import com.mindtree.gooddeed.repository.GoodDeedRepository;
import com.mindtree.gooddeed.repository.SupervisorRepository;
import com.mindtree.gooddeed.service.GoodDeedService;

@Service
public class GoodDeedServiceImpl implements GoodDeedService {

	@Autowired
	GoodDeedRepository goodDeedRepository;

	@Autowired
	CampusMindRepository campusMindRepository;
	
	@Autowired
	SupervisorRepository supervisorRepository;

	@Override
	public void addGoodDeedToCampusMind(List<CampusMindDto> campusminddto, int goodDeedId) {
		// TODO Auto-generated method stub

		GoodDeed gooddeed = goodDeedRepository.getOne(goodDeedId);
		List<CampusMind> listOfCampusMind = new ArrayList<>();
		CampusMind campusMindObj;
		for (CampusMindDto campusMindDto : campusminddto) {
			campusMindObj=new CampusMind();
			campusMindObj.setMid(campusMindDto.getMid());
			campusMindObj.setName(campusMindDto.getName());
			campusMindObj.setGooddeed(gooddeed);
			listOfCampusMind.add(campusMindObj);
			campusMindRepository.saveAll(listOfCampusMind);
		}
	}

	@Override
	public List<CampusMindDto> getAllCampusMindsForPerticularGoodDeedId(int goodDeedId) {
		// TODO Auto-generated method stub
		List<CampusMindDto>campusMindsDto=new ArrayList<CampusMindDto>();
		List<CampusMind> campusMinds = new ArrayList<CampusMind>();
		GoodDeed goodDeeds = goodDeedRepository.getOne(goodDeedId);
		
		campusMinds = goodDeeds.getCampusMinds();
		
		for (CampusMind campusMind : campusMinds) {
			CampusMindDto campusMindDto=new CampusMindDto();
			campusMindDto.setMid(campusMind.getMid());
			campusMindDto.setName(campusMind.getName());
			campusMindsDto.add(campusMindDto);
			
		}
		return campusMindsDto;
	}

	@Override
	public List<GoodDeed> getAllGoodDeedsForCampusMindsLessThanThree() {
	
		List<GoodDeed> goodDeeds = new ArrayList<>();
		
		List<GoodDeed> goodDeedsLessThanThree = new ArrayList<>();

		goodDeeds = goodDeedRepository.findAll();
		for (GoodDeed goodDeed : goodDeeds) {
			if (goodDeed.getCampusMinds().size() < 3) {
				goodDeedsLessThanThree.add(goodDeed);
			}
		}

		return goodDeedsLessThanThree;
	}

	@Override
	public GoodDeed getSupervisorAndItsObjects(int supervisorId) {
		// TODO Auto-generated method stub
		Supervisor supervisor=supervisorRepository.getOne(supervisorId);
		
				GoodDeed gd=supervisor.getGooddeed();
			
				
		
//		List<GoodDeed> goodDeeds=new ArrayList<>();
//		List<CampusMind>camp=new ArrayList<CampusMind>();
//		List<CampusMind>campusMinds=campusMindRepository.findAll();
//		for (GoodDeed goodDeed : goodDeeds) {
//		for (CampusMind campusMind : campusMinds) {
////			if(goodDeed.getSupervisor().getSupervisorId()==supervisorId) {
//				goodDeed.setCampusMinds(campusMinds);
//				System.out.println(goodDeed);
//				supervisor.setGoodDeed(goodDeed);
//				System.out.println(supervisor);
//				
//			}
//		}
////		}
//		List<CampusMind> campusMinds = new ArrayList<CampusMind>();
//		GoodDeed gd=new GoodDeed();
//		//supervisorId=gd.getSupervisor().getSupervisorId();
//		GoodDeed goodDeeds = goodDeedRepository.getOne(supervisorId);
//		campusMinds = goodDeeds.getCampusMinds();
//		supervisor.getGooddeed().getCampusMinds();
	
		
		
		
		
		
		return gd;
	}

}
