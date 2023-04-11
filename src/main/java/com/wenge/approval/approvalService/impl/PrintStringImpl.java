package com.wenge.approval.approvalService.impl;

import com.wenge.approval.approvalService.PrintString;
import org.springframework.stereotype.Service;

@Service
public class PrintStringImpl implements PrintString {
    @Override
    public String IPrintString(String name) {
        System.out.println("name:"+name);
        return name;
    }
}
