package com.xt.shiro.factory;

import java.util.LinkedHashMap;

/**
 * @author xt
 * @create 2019/4/14 23:46
 * @Desc
 */
public class FilterChainDefinitionMapBuilder {

    public LinkedHashMap<String, String> buildFilterChainDefinitionMap() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("/login", "anon");
        linkedHashMap.put("/shiro/login", "anon");
        linkedHashMap.put("/shiro/logout", "logout");
        linkedHashMap.put("/admin.jsp", "roles[admin]");
        linkedHashMap.put("/user.jsp", "roles[user]");
        linkedHashMap.put("/**", "authc]");

        return linkedHashMap;
    }
}
