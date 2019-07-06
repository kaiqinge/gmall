package com.atguigu.gmall;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kaiqinge
 * @since 2019/5/15
 */
@Data
public class SkuLsParams implements Serializable {

    String  keyword;

    String catalog3Id;

    String[] valueId;

    int pageNo=1;

    int pageSize=20;
}
