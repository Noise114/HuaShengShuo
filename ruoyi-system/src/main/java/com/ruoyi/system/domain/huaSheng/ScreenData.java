package com.ruoyi.system.domain.huaSheng;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【屏幕数据】对象 screen_data
 *
 * @author 屏幕数据
 * @date 2024-03-19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ScreenData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 机型id */
    private Long modelId;

    /** 手动最高亮度 */
    private Long manualMaxBrightness;

    /** 亮度均匀性 */
    private BigDecimal brightnessUniformity;

    /** 全局激发亮度 */
    private Long globalIllumination;

    /** 屏幕功耗 */
    private BigDecimal screenPowerConsumption;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;


}
