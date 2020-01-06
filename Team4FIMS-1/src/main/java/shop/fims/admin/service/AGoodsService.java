package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AGoodsMapper;

@Service
public class AGoodsService {

	@Autowired
	private AGoodsMapper aGoodsMapper;
}
