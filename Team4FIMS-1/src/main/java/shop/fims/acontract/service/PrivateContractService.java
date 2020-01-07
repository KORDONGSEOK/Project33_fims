package shop.fims.acontract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.acontract.mapper.PrivateContractMapper;

@Service
public class PrivateContractService {

	@Autowired
	private PrivateContractMapper privateContractMapper;
}
