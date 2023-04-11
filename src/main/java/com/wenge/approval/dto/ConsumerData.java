package com.wenge.approval.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerData {
    /*
    根据实际情况而定
     */
    private String tableName;
    private String operation;
    private String data;
}
