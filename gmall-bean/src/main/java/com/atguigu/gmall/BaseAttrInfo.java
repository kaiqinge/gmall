package com.atguigu.gmall;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author kaiqinge
 * @since 2019/5/9
 */
@Data
public class BaseAttrInfo implements Serializable {

    String a = "修改过的东西";

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;
    @Transient
    private List<BaseAttrValue> attrValueList;

}
