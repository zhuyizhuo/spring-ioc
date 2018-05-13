package com.yizhuo.java.spring.annotation;

import javax.annotation.Resource;
import java.lang.annotation.*;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default  "";
}
