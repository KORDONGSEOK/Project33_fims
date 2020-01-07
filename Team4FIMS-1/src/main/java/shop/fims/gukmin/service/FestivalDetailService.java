package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.FestivalDetailMapper;

@Service
public class FestivalDetailService {

	@Autowired
	private FestivalDetailMapper festivalDetailMapper;
}
