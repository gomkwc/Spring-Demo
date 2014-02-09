package com.neowiz.spring.demo.web;

import com.neowiz.spring.demo.domain.User;
import com.neowiz.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * User: David KIM
 * Date: 14. 2. 9.
 * Time: 오후 1:50
 */
@Controller
public class UserController  {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo.do", method= RequestMethod.GET)
    protected ModelAndView handleData(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("### Data ###");
        List<User> list = (List<User>) userService.getUserInfo();

        ModelAndView mav = new ModelAndView();
        mav.addObject("userList",list);
        mav.setViewName("login/index_data");

        return mav;
    }
}