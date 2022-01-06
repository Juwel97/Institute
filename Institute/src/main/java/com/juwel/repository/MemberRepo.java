package com.juwel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.juwel.model.Member;

public interface MemberRepo extends MongoRepository<Member, String> {

}
