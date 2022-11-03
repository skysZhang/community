package com.nowcoder.community.service;

import org.apache.catalina.util.ToStringUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    public AlphaService() {
        System.out.println("实例化 AlphaService");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化 AlphaService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁 AlphaService");
    }
}
