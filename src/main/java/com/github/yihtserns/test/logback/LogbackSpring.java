package com.github.yihtserns.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yihtserns
 */
public class LogbackSpring {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger("tester");
        for (int i = 0; i < 1000; i++) {
            log.debug("test {}", i + 1);
        }

        new ClassPathXmlApplicationContext("com/github/yihtserns/test/logback/applicationContext.xml");
    }
}
