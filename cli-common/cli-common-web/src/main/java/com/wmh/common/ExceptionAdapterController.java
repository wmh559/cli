package com.wmh.common;

import com.wmh.bean.Result;
import com.wmh.bean.ResultCode;
import com.wmh.bean.ResultMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wmh
 * 自定义异常拦截处理器
 */
@RestControllerAdvice
public class ExceptionAdapterController {

    @ExceptionHandler(ArithmeticException.class)
    public Result handleRunTimeException(ArithmeticException e) {
        e.printStackTrace();
        return Result.fail(ResultCode.ArithmeticExceptionCode, ResultMessage.ARITHMETICERROR);
    }
}
