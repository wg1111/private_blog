package com.wg.aspect.annotation;

import java.lang.annotation.*;

/**
 * @author: insane
 * @Date: 2019/11/1 13:25
 * Describe:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermissionCheck {

    String value();

}
