package com.neowiz.spring.demo.service;


import com.neowiz.spring.demo.domain.User;

import java.util.List;

public interface UserService {
	
	// 회원정보 객체 리스트를 가져온다.
	public List<User> getUserInfo() throws Exception;
	
}  