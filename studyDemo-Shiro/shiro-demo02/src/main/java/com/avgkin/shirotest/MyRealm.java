package com.avgkin.shirotest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;

public class MyRealm extends AuthenticatingRealm {
    //该方法只是获取进行对比的信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1.获取身份信息
        String principal = authenticationToken.getPrincipal().toString();
        //2.获取凭证信息
        String password = new String((char[]) authenticationToken.getCredentials());
        System.out.println(principal+" "+password);
        //3.获取数据库中存储的用户信息
        if("zhangsan".equals(principal)) {
            String pwdinfo = "z3";
            //4.封装校验逻辑需要的对象
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(authenticationToken.getPrincipal(), pwdinfo, authenticationToken.getPrincipal().toString());
            return authenticationInfo;
        }
        return null;
    }
}
