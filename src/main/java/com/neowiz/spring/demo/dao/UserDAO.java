package com.neowiz.spring.demo.dao;

import com.neowiz.spring.demo.domain.User;

import java.util.List;

/**
 *
 * UserDAO 는 회원정보 관련 DAO 인터페이스이다.
 *
 */
public interface UserDAO {
	  
	// 회원정보 객체 리스트를 가져온다.
	public List<User> getUserInfo() throws Exception;
	
} 
