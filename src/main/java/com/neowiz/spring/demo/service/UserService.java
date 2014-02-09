package com.neowiz.spring.demo.service;


import com.neowiz.spring.demo.domain.User;

import java.util.List;

/**
 *
 * UserService 는 회원정보 관련 서비스 인터페이스이다.
 *
 */
public interface UserService {
	
	// 회원정보 객체 리스트를 가져온다.
	public List<User> getUserInfo() throws Exception;
	
}  