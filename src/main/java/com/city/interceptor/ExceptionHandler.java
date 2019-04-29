package com.city.interceptor;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: mvc异常拦截
 * @DATE: 2018-05-17 15:00
 * @throws
 */
public class ExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        return new ModelAndView("505");
    }
}
