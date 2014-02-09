package com.neowiz.spring.demo.dao;

import com.neowiz.spring.demo.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

	/**
	 * 
	 * 테스트
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUserInfo() throws Exception {
		List<User> list =  getSqlSession().selectList("userDAO.GET_USER_INFO");
		return list;
	}
	
}