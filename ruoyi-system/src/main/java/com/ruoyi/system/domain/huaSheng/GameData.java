package com.ruoyi.system.domain.huaSheng;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【游戏数据】对象 game_data
 *
 * @author noise
 * @date 2024-03-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GameData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 机型id */
    private Long modelId;

    /** 游戏id */
    private Long gameId;

    /** 帧率 */
    private BigDecimal frameRate;

    /** 功耗 */
    private BigDecimal powerConsumption;

    /** 帧率图片地址 */
    private String frameRateImageUrl;

    /** 功耗图片地址 */
    private String powerConsumptionImageUrl;

    /** 温度正面图片地址 */
    private String temperatureFrontImageUrl;

    /** 温度侧面图片地址 */
    private String temperatureSideImageUrl;

    /** 温度背面面图片地址 */
    private String temperatureBackImageUrl;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;


}
