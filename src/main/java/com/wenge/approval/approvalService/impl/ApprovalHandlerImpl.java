package com.wenge.approval.approvalService.impl;

import com.wenge.approval.annotations.ApprovalHandlerType;
import com.wenge.approval.config.ApprovalConfigStrategy;
import com.wenge.approval.dto.ConsumerData;
import org.springframework.stereotype.Service;

@Service
public class ApprovalHandlerImpl {
    public void approvalHandler(ConsumerData consumerData) {
        //方式一，用静态常量做映射关系
        //  ApprovalConfigStrategy.aMap.get(ApprovalConstant.ApprovalMapper.get(consumerData.getTableName())).handler(consumerData);
        // 方式二，用注解做映射关系
        ApprovalHandlerType approvalHandlerType = new ApprovalHandlerTypeImpl(consumerData.getOperation(), consumerData.getTableName());
        ApprovalConfigStrategy.approvalMap.get(approvalHandlerType).handler(consumerData);
    }
}
