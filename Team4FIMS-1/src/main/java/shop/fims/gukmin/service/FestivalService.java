package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.FestivalMapper;

@Service
public class FestivalService {

	@Autowired
	private FestivalMapper festivalMapper;
}
