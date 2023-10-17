package com.zhangheng.enhance;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Repeatable(ModularLoad.List.class)
public @interface ModularLoad {

    /**
     * 注解所依赖的环境
     */
    String[] env();

    Class<?>[] annotation();

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    @interface List {
        ModularLoad[] value();
    }

}
