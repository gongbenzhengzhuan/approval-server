package com.wenge.approval.annotations;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ApprovalHandlerTypes.class)
@Service
public @interface ApprovalHandlerType {
    String operation();

    String tableName();
}

