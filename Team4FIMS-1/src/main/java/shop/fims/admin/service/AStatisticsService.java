package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AStatisticsMapper;

@Service
public class AStatisticsService {

	@Autowired
	private AStatisticsMapper aStatisticsMapper;
}
