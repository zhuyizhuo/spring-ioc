package com.yizhuo.java.spring.annotation;

import java.lang.annotation.*;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {
    String value() default "";
}
