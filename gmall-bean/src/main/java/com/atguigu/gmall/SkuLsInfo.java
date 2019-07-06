package com.atguigu.gmall;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author kaiqinge
 * @since 2019/5/15
 */
@Data
public class SkuLsInfo implements Serializable {
    String id;

    BigDecimal price;

    String skuName;

    String skuDesc;

    String catalog3Id;

    String skuDefaultImg;

    Long hotScore=0L;

    List<SkuLsAttrValue> skuAttrValueList;


}
