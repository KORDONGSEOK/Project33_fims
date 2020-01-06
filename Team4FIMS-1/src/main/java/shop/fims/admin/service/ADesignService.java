package shop.fims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.ADesignMapper;

@Service
public class ADesignService {

	@Autowired
	private ADesignMapper aDesignMapper;
}
