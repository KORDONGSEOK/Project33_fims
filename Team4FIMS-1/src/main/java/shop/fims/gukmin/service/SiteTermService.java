package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.SiteTermMapper;

@Service
public class SiteTermService {

	@Autowired
	private SiteTermMapper siteTermMapper;
}
