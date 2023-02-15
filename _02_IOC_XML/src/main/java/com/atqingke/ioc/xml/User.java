package com.atqingke.ioc.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {

    private Logger log = LoggerFactory.getLogger(User.class);

    private String name;
    private Integer age;

    public void run() {
        log.info("======user run=======");
    }
}
