package com.qty.log.Annon;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogByMe {

    /**
     * 工程
     * @return
     */
    String project() default "";

    /**
     * 方法
     * @return
     */
    String func() default "";
}
