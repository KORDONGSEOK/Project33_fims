package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.APromotionMapper;

@Service
public class APromotionService {

	@Autowired
	private APromotionMapper aPromotionMapper;
}
