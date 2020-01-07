package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.ABaseInfoMapper;

@Service
public class ABaseInfoService {

	@Autowired
	private ABaseInfoMapper aBaseInfoMapper;
}
