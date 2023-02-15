package com.atqingke;

import com.atqingke.ioc.xml.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _01GetBeanTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    private Logger log = LoggerFactory.getLogger(_01GetBeanTest.class);

    @Test
    public void getBeanById() {
        User user = (User) context.getBean("user");
        log.info("====={}=====", user);
    }
}
