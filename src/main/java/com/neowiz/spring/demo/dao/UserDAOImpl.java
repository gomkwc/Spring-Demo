package com.neowiz.spring.demo.dao;

import com.neowiz.spring.demo.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

    /**
     *
     * 회원정보 객체 리스트를 가져온다.
     *
     * @return  User 리스트 객체
     * @throws Exception  Exception 객체
     */
    public List<User> getUserInfo() throws Exception {
		List<User> list =  getSqlSession().selectList("userDAO.GET_USER_INFO");
		return list;
	}
	
}