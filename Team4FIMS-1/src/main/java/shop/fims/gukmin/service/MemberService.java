package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper MemberMapper;
}
