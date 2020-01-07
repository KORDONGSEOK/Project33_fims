package shop.fims.ebudget.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.ebudget.mapper.ExecutionMapper;

@Service
public class ExecutionService {

	@Autowired
	private ExecutionMapper executionMapper;
}
