package com.xt.shiro.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import java.util.Date;

/**
 * @author xt
 * @create 2019/4/14 22:48
 * @Desc
 */
public class ShiroService {

    // 注意开启注解扫描配置路径
    @RequiresRoles({"admin"})
    public void testMethod() {
        System.out.println("testMethod, time: " + new Date());
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        Object key = session.getAttribute("key");
        System.out.println(key);
    }
}
