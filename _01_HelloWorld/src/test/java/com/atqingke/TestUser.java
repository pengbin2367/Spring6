package com.atqingke;

import com.atqingke.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testAdd() {
        // 1. Loading Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2. Get the created Object
        User user = (User) context.getBean("user");
        // 3. Call the method with Object
        user.add();
    }
}
