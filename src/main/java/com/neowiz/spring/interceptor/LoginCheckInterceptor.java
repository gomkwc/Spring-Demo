package com.neowiz.spring.interceptor;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * GE Team - NMP AP
 *
 * @author David KIM
 * @since 1.0
 */
@Service
public class LoginCheckInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.print("LoginCheckInterceptor Call");
        return true;
    }
}
