package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AOrderMapper;

@Service
public class AOrderService {

	@Autowired
	private AOrderMapper AOrderMapper;
}
