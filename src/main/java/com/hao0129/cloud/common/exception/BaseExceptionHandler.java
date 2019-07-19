package com.hao0129.cloud.common.exception;

import com.hao0129.cloud.common.util.RenderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseExceptionHandler extends RuntimeException{

    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @Autowired
    protected RenderUtil render;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String ExceptionHandler(Exception e){
        String message = e.getMessage();
        logger.debug("Exception:{}",message);
        e.printStackTrace();
        return render.failMsg(e.getMessage());
    }
}
