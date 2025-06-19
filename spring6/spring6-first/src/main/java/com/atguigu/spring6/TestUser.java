package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @Author: 刘康
 * @CreateTime: 2025/6/19 15:26
 * @Version: V1.0.0
 */
public class TestUser {
    @Test
    public void testUserObject() {
        // 加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        // 使用对象调用方法测试
        user.add();
    }

    // 放射创建对象
    @Test
    public void testUserObject1() throws Exception {
        // 获取类对象
        Class<?> clazz = Class.forName("com.atguigu.spring6.User");
        // 调用方法创建对象
        // 不建议使用，弃用方法
        // Object o = clazz.newInstance();
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
