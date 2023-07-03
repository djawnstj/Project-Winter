package com.project.winter.mvc.handler.adapter;

import com.project.winter.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleControllerHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof Controller);
    }

    @Override
    public String handle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        return ((Controller) handler).handleRequest(req, res);
    }
}
