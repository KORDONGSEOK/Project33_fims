package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AServiceMapper;

@Service
public class AServiceService {

	@Autowired
	private AServiceMapper aServiceMapper;
}
