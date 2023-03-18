package com.wpl.springboot.exception;

import com.wpl.springboot.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理类
 * @date 2022/4/4
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * @ExceptionHandler相当于controller的@RequestMapping
     * 如果抛出的是ServiceException，则调用该方法
     * @param se 业务异常
     * @return Result
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result handle(ServiceException se) {
        return Result.error(se.getCode(), se.getMessage());
    }
}
