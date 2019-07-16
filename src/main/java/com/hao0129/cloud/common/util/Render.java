package com.hao0129.cloud.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Render {

    public String successMsg(){
        return successMsg(null);
    }

    public String successMsg(String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("SUCCESS",true);
        jsonObject.put("CONTEXT",msg);
        return jsonObject.toJSONString();
    }

    public String failMsg(){
        return failMsg(null);
    }

    public String failMsg(String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("SUCCESS",false);
        jsonObject.put("CONTEXT",msg);
        return jsonObject.toJSONString();
    }

    public String successData(Object object){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("SUCCESS",true);
        jsonObject.put("CONTEXT", object);
        return jsonObject.toJSONString();
    }

    public String toJSON(Object object){
        return JSON.toJSONString(object);
    }
}
