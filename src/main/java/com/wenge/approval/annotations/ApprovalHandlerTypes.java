package com.wenge.approval.annotations;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Service
public @interface ApprovalHandlerTypes {
    ApprovalHandlerType[] value();
}

