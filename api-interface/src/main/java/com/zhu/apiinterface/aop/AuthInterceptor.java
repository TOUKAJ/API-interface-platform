//package com.zhu.apiinterface.aop;
//
//
//import com.zhu.apiinterface.utils.SignUtils;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * 权限校验 AOP
// *
// */
//@Aspect
//@Component
//public class AuthInterceptor {
//
//
//
//
//    /**
//     * 执行拦截
//     *
//     * @param joinPoint
//     * @return
//     */
//    @Around("execution(* com.zhu.apiinterface.controller.NameController.*(..))")
//    public Object doInterceptor(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
//        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
//
//        String accessKey = request.getHeader("accessKey");
//
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        if(!accessKey.equals("api")){
//            throw new RuntimeException("无权限");
//        }
//
//
//        String s = SignUtils.genSign(body, "abcdefgh");//查数据库得到secretkey
//        if(!s.equals(sign)){
//            throw new RuntimeException("无权限");
//        }
//
//        return joinPoint.proceed();
//    }
//}
//
