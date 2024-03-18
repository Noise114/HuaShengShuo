package com.ruoyi.system.domain.huaSheng;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【游戏基础信息】对象 game_basic_info
 *
 * @author noise
 * @date 2024-03-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GameBasicInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 游戏id */
    private Long gameId;

    /** 游戏名称 */
    private String gameName;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /** 更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

}
