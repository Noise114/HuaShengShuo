package com.ruoyi.system.domain.huaSheng;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【手机基础数据】对象 mobile_basic_data
 *
 * @author noise
 * @date 2024-03-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MobileBasicData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机型id */
    private Long modelId;

    /** 机型名称 */
    private String modelName;

    /** 发布日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;

    /** 处理器型号 */
    private String processorModel;

    /** 起售价格 */
    private BigDecimal startingPrice;

    /** 测试版本 */
    private String testVersion;

    /** 电池容量 */
    private Long batteryCapacity;

    /** 屏幕尺寸 */
    private BigDecimal screenSize;

    /** 机身厚度 */
    private BigDecimal thickness;

    /** 机身重量 */
    private BigDecimal weight;

    /** 充电功率 */
    private Long chargingPower;

    /** 备注 */
    private String remarks;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;


}

