package com.ruoyi.system.domain.huaSheng;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【充电数据】对象 charging_data
 *
 * @author noise
 * @date 2024-03-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ChargingData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 机型id */
    private Long modelId;

    /** 充电时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date chargingTime;

    /** 手机完全充满时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fullChargeTime;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

}
