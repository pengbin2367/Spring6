package com.atqingke;

import com.atqingke.ioc.xml.User;
import com.atqingke.ioc.xml.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _01GetBeanTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    private Logger log = LoggerFactory.getLogger(_01GetBeanTest.class);

    @Test
    public void getBeanByInterface() {
        UserService userService = context.getBean(UserService.class);
        log.info("====={}=====", userService);
    }

    @Test
    public void getBeanById() {
        User user = (User) context.getBean("user");
        log.info("====={}=====", user);
    }

    // Using this method means that there is only one bean of this class
    // NoUniqueBeanDefinitionException: No qualifying bean of type 'com.atqingke.ioc.xml.User' available: expected single matching bean but found 2: user,user1
    @Test
    public void getBeanByClass() {
        User user = context.getBean(User.class);
        log.info("====={}=====", user);
    }

    @Test
    public void getBeanByIdAndClass() {
        User user = context.getBean("user", User.class);
        log.info("====={}=====", user);
    }
}
