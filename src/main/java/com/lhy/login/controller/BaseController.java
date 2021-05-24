package com.lhy.login.controller;

import com.lhy.ex.BaseEx;
import com.lhy.ex.UserNotFoundEx;
import com.lhy.vo.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class BaseController {
    @ExceptionHandler(BaseEx.class)
    @ResponseBody
    public JsonResult<Void> handlerException(Throwable e) {
        JsonResult<Void> jr = new JsonResult<>();
        if(e instanceof UserNotFoundEx){
           setError(jr,e);
        }
        return jr;
    }
    private void setError(JsonResult<Void> jr, Throwable e){
        jr.setMessage(e.getMessage());
        jr.setCode(123);
    }
}
