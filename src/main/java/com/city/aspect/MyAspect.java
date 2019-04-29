package com.city.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: 切面
 * @DATE: 2018-05-17 13:31
 * @throws
 */
@Aspect
@Component
public class MyAspect  {
    /**
     * 申明目标切入点范围
     * 1.方法必须private,没有返回值，没有参数
     * 2.之后使用将其当成方法调用。例如：@After("myPointcut()")
     */
    /*Pointcut("execution(*com.city.service.impl.UserServiceImpl.queryUserId(..))")
    private void pointCut(){} */

    @Around("execution(* com.city.service..impl.UserServiceImpl.queryUserById(..))")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("测试AOP 前======================");
        //手动执行目标类
        Object obj = joinPoint.proceed();
        System.out.println("测试AOP 后======================");
        return obj;
    }

    public void myBefore(Joinpoint joinpoint){
        System.out.println("测试 AOP 前置通知1");
        System.out.println("测试 AOP 前置通知2");
    }

}
