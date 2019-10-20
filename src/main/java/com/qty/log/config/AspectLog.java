package com.qty.log.config;

import com.google.gson.Gson;
import com.qty.log.Annon.LogByMe;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AspectLog {

    private Logger logger= LoggerFactory.getLogger(AspectLog.class);

    @Pointcut("@annotation(com.qty.log.Annon.LogByMe)")
    private void pointcut(){
    }

    @Before("pointcut()&&@annotation(logByMe)")
    public void before(JoinPoint joinPoint, LogByMe logByMe){
        Object[]args=joinPoint.getArgs();
        logger.error(logByMe.project()+";"+logByMe.func()+";"+"请求的参数是："+new Gson().toJson(args));
    }
}
