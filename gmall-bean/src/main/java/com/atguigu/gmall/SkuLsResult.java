package com.atguigu.gmall;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author kaiqinge
 * @since 2019/5/15
 */
@Data
public class SkuLsResult implements Serializable {

    List<SkuLsInfo> skuLsInfoList;

    long total;

    long totalPages;

    List<String> attrValueIdList;
}
