package com.wenge.approval.constant;

import java.util.HashMap;
import java.util.Map;

public class ApprovalConstant {
    public static final Map<String, String> ApprovalMapper = new HashMap<String, String>();

    static {
        ApprovalMapper.put("one", "approvalHandlerOneImpl");
        ApprovalMapper.put("two", "approvalHandlerTwoImpl");
    }
}
