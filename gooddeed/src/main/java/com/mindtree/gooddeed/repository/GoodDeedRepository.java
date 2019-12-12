package com.mindtree.gooddeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.gooddeed.entity.GoodDeed;

@Repository
public interface GoodDeedRepository extends JpaRepository<GoodDeed, Integer>{

}
