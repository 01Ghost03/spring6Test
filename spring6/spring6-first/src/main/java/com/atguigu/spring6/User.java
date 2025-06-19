package com.atguigu.spring6;

/**
 * @Description: TODO
 * @Author: 刘康
 * @CreateTime: 2025/6/19 15:08
 * @Version: V1.0.0
 */
public class User {
    public void add() {
        System.out.println("add...");
    }
    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
