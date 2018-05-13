package com.yizhuo.java.spring.annotation;

import java.lang.annotation.*;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}
