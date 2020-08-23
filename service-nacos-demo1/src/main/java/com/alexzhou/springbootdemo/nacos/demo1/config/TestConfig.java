package com.alexzhou.springbootdemo.nacos.demo1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class TestConfig {

    @Value("${testConf1}")
    private String testConf1;

    public String getTestConf1() {
        return testConf1;
    }

    public void setTestConf1(String testConf1) {
        this.testConf1 = testConf1;
    }
}
