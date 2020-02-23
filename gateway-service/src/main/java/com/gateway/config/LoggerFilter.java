//package com.gateway.config;
//
//import com.netflix.zuul.ZuulFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//
//import org.springframework.stereotype.Component;
//
///**
// * 本案例中加入了链路操作人。另外在这个过滤器中可以获取当前链路的traceID,
// * traceId作为链路数据的唯一标识 ， 可以存储在LOG日志当中，方便后续查找。
// * 案例只是将traceID打印在控制台上。
// */
//
//@Component
//public class LoggerFilter extends ZuulFilter {
//
//
//    @Override
//    public String filterType() {
//        return FilterConstants.POST_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return 900;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//
//        System.out.println("==========>");
//
//        return null;
//    }
//}
