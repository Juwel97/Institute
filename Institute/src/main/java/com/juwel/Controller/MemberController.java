package com.juwel.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juwel.model.Member;
import com.juwel.service.MemberService;


@RestController
public class MemberController {
	
	@Autowired
	MemberService  emberService;
	
	@PostMapping("/addMember")
	public String addMember(@RequestBody Member  member) {
		emberService.save(member);
		return "Success :" + member.getEmail() + " added";
	}
	
	@GetMapping("/findAllMember")
	public List<Member> findAllMember(){
		return emberService.findAll();
	}
	
//	@PostMapping("/findMember/{email}")
//	public Optional<Member> findMember(@PathVariable String email){
//		return emberService.findById(email);
//	}
//	
//	@DeleteMapping("/removeMember/{email}")
//	public String removeMember(@PathVariable String email) {
//		emberService.deleteById(email);
//		return "Success :" + email + "  deleted";
//	}

}
