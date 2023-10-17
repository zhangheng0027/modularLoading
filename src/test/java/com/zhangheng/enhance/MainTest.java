package com.zhangheng.enhance;


import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;
import org.junit.jupiter.api.Test;

import java.beans.JavaBean;

class MainTest {

    @Test
    public void test01() {
        System.out.println("test01 " + TestModularLoad.class.getAnnotation(JavaBean.class));
    }


    @ModularLoad(env = {"production"}, annotation = {JavaBean.class})
    @JavaBean
    static class TestModularLoad {

        @ModularLoad(env = {"test"}, annotation = {NotBlank.class})
        @NotBlank
        private String name;

    }
}