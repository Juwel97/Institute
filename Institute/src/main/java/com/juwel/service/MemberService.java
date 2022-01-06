package com.juwel.service;

import java.util.List;

import com.juwel.model.Member;

public interface MemberService {
	
	public void save(Member member);

	public List<Member> findAll();

}
