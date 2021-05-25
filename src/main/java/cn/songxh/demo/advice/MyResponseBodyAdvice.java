package cn.songxh.demo.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author xiangheng.song
 * @date 2021/5/25 19:48
 */
@RestControllerAdvice("cn.songxh.demo.web")
public class MyResponseBodyAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        MyResponse resp = new MyResponse();
        resp.setData(body);
        return resp;
    }

    @ExceptionHandler
    public MyResponse exceptionHandler(Exception e) {
        e.printStackTrace();
        MyResponse resp = new MyResponse();
        resp.setSuccess(false);
        return resp;
    }
}
