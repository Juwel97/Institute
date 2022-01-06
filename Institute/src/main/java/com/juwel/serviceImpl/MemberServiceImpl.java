package com.juwel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juwel.model.Member;
import com.juwel.repository.MemberRepo;
import com.juwel.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepo memberRepo;
	
	public void save(Member member) {
		memberRepo.save(member);		
	}

	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
