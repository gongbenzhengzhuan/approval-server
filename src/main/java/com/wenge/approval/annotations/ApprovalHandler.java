package com.wenge.approval.annotations;

import com.wenge.approval.dto.ConsumerData;
import org.springframework.stereotype.Component;

@Component
public interface ApprovalHandler {
    public  String handler(ConsumerData consumerData);
}
