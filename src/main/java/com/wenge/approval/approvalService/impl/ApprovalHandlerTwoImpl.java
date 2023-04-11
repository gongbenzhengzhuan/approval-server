package com.wenge.approval.approvalService.impl;

import com.wenge.approval.annotations.ApprovalHandler;
import com.wenge.approval.annotations.ApprovalHandlerType;
import com.wenge.approval.dto.ConsumerData;
import org.springframework.stereotype.Service;

@Service
@ApprovalHandlerType(operation = "insert", tableName = "two")
public class ApprovalHandlerTwoImpl implements ApprovalHandler {
    @Override
    public String handler(ConsumerData consumerData) {
        System.out.println(" handler ApprovalHandlerTwoImpl:"+consumerData.getData());
        return null;
    }
}
