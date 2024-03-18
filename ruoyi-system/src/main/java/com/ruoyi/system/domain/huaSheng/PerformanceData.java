package com.ruoyi.system.domain.huaSheng;


import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【性能数据】对象 performance_data
 *
 * @author ruoyi
 * @date 2024-03-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PerformanceData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 25个应用打开速度 */
    private BigDecimal appOpenSpeed25;

    /** 25个应用后台保留数 */
    private Long appBackgroundRetain25;

    /** geekbench6单核跑分 */
    private Long geekbench6SingleCoreScore;

    /** geekbench6多核跑分 */
    private Long geekbench6MultiCoreScore;

    /** 安兔兔跑分 */
    private Long antutuScore;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

}

