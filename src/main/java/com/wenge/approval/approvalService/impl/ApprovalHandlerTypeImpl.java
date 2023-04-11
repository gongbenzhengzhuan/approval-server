package com.wenge.approval.approvalService.impl;

import com.wenge.approval.annotations.ApprovalHandlerType;
import java.lang.annotation.Annotation;

public class ApprovalHandlerTypeImpl implements ApprovalHandlerType {
    private String operation;
    private String tableName;

    public ApprovalHandlerTypeImpl(String operation, String tableName) {
        this.operation = operation;
        this.tableName = tableName;
    }

    @Override
    public String operation() {
        return operation;
    }

    @Override
    public String tableName() {
        return tableName;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return ApprovalHandlerType.class;
    }

    public int hashCode() {
        int hashCode = 0;
        hashCode += (127 * "operation".hashCode()) ^ operation.hashCode();
        hashCode += (127 * "tableName".hashCode()) ^ tableName.hashCode();
        return hashCode;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ApprovalHandlerType)) {
            return false;
        }
        ApprovalHandlerType other = (ApprovalHandlerType) obj;
        return operation.equals(other.operation()) && tableName.equals(other.tableName());
    }
}
