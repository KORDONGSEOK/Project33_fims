package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AScmMapper;

@Service
public class AScmService {

	@Autowired
	private AScmMapper aScmMapper;
}
