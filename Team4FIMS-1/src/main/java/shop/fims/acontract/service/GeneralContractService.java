package shop.fims.acontract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.acontract.mapper.GeneralContractMapper;

@Service
public class GeneralContractService {

	@Autowired
	private GeneralContractMapper generalContractMapper;
}
