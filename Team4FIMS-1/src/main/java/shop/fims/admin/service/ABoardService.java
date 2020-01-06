package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.ABoardMapper;

@Service
public class ABoardService {

	@Autowired
	private ABoardMapper aBoardMapper;
}
