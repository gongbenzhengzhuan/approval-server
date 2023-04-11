package com.wenge.approval.controller;

import com.wenge.approval.approvalService.PrintString;
import com.wenge.approval.approvalService.impl.ApprovalHandlerImpl;
import com.wenge.approval.dto.ConsumerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApprovalController {
    @Autowired
    ApprovalHandlerImpl approvalHandler;
    @Autowired
    PrintString printString;

    //http://localhost:8080/testApproval
    //{"tableName":"one","operation":"insert","data":"hi"}
    @RequestMapping("/testApproval")
    @ResponseBody
    public String testSendMsg(@RequestBody ConsumerData consumerData) {
        approvalHandler.approvalHandler(consumerData);
        printString.IPrintString("刘德华");
        return "true";
    }
}
