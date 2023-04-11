package com.wenge.approval.config;

import com.wenge.approval.annotations.ApprovalHandler;
import com.wenge.approval.annotations.ApprovalHandlerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class ApprovalConfigStrategy {
    public static Map<String, ApprovalHandler> aMap = new HashMap<>();

    @Autowired
    public  void setApprovalHandlerTest(Map<String, ApprovalHandler> approvalHandlers){
        ApprovalConfigStrategy.aMap=approvalHandlers;
        System.out.println(ApprovalConfigStrategy.aMap);
        System.out.println("approvalHandlers:"+approvalHandlers.values());
    }

    public static Map<ApprovalHandlerType,ApprovalHandler> approvalMap = new HashMap<>();
    @Autowired
    public void setApprovalHandler(List<ApprovalHandler> approvalHandlers){
        approvalHandlers.forEach(approvalHandler -> {
            ApprovalHandlerType[] annotationsByType = approvalHandler.getClass().getAnnotationsByType(ApprovalHandlerType.class);
            Arrays.stream(annotationsByType).forEach(annotation -> approvalMap.put(annotation, approvalHandler));
        });
        System.out.println(approvalMap.values());
        System.out.println(approvalMap.keySet());
    }
}
