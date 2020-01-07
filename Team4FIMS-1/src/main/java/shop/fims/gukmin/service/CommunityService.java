package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.CommunityMapper;

@Service
public class CommunityService {

	@Autowired
	private CommunityMapper communityMapper;
}
