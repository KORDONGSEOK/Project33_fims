package shop.fims.ebudget.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.ebudget.mapper.BudgetMapper;

@Service
public class BudgetService {

	@Autowired
	private BudgetMapper BudgetMapper;
}
