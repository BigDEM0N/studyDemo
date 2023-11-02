package com.avgkin.shirotest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class ShiroRun {
    public static void main(String[] args) {
        //1.初始化 获取SecurityManager
        IniSecurityManagerFactory securityManagerFactory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = securityManagerFactory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //2.获取sbuject对象
        Subject subject = SecurityUtils.getSubject();
        //3.创建token对象
        AuthenticationToken token = new UsernamePasswordToken("zhangsan","z3");
        //4.完成登录
        subject.login(token);
    }
}
