package com.neowiz.spring.demo.service;


import com.neowiz.spring.demo.dao.UserDAO;
import com.neowiz.spring.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;


    /**
     *
     * 회원정보 객체 리스트를 가져온다.
     *
     * @return  User 리스트 객체
     * @throws Exception  Exception 객체
     */
	public List<User> getUserInfo() throws Exception {
		
		List<User> list = (List<User>) userDAO.getUserInfo();
		return list;
	}

}