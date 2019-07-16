package com.hao0129.cloud.common.controller;

import com.hao0129.cloud.common.util.Render;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    @Autowired
    protected Render render;

    public String getRemoteAddr(){
        return request.getRemoteAddr();
    }
}
