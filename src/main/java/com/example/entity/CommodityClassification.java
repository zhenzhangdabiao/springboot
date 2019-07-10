package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhuBin
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CommodityClassification implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Classify_ID", type = IdType.AUTO)
    private Integer classifyId;

    @TableField("Good_kinds_Name")
    private String goodKindsName;

    @TableField("Upper_ID")
    private Integer upperId;

    @TableField("Upper_Name")
    private String upperName;

    @TableField("Description")
    private String Description;


}
