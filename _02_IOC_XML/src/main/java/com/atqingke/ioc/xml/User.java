package com.atqingke.ioc.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {

    private Logger log = LoggerFactory.getLogger(User.class);

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void run() {
        log.info("======user run=======");
    }
}
