package com.yizhuo.java.spring.annotation;

import java.lang.annotation.*;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}
